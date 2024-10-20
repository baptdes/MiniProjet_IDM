package simplepdl.toPetri;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Need;
import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.SimplepdlPackage;

import petriNet.*;

public class SimplePDL2PetriNet {
	
	// |||||||||||||||||||||||||||||||||||| Variables globales |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	
	private static PetriNetFactory myPetriFactory = PetriNetFactory.eINSTANCE;
	private static Reseau reseau;
	
	//||||||||||||||||||| HashMap pour stocker les liens des différentes WorkDefinition ||||||||||||||||||||||||||||||||
	
    private static Map<WorkDefinition, Object[]> workDefinitionMap = new HashMap<>();
    
    /**
     * Ajoute une association entre un WorkDefinition et les objets Place et Transition associés.
     *
     * @param wd      Le WorkDefinition auquel les objets seront associés
     * @param hasStarted   L'objet Place représentant "HasStarted"
     * @param finished     L'objet Place représentant "Finished"
     * @param t2Finished   L'objet Transition représentant "T2Finished"
     * @param t2Started    L'objet Transition représentant "T2Started"
     */
    private static void addWorkDefinitionMapping(WorkDefinition wd, Place hasStarted, Place finished, Transition t2Finished, Transition t2Started) {
        Object[] mapping = new Object[] { hasStarted, finished, t2Finished, t2Started };
        workDefinitionMap.put(wd, mapping);
    }

    private static Place getHasStarted(WorkDefinition wd) {
        return (Place) workDefinitionMap.get(wd)[0];
    }
    
    private static Place getFinished(WorkDefinition wd) {
        return (Place) workDefinitionMap.get(wd)[1];
    }

    private static Transition getT2Finished(WorkDefinition wd) {
        return (Transition) workDefinitionMap.get(wd)[2];
    }

    private static Transition getT2Started(WorkDefinition wd) {
        return (Transition) workDefinitionMap.get(wd)[3];
    }
    
    // ||||||||||| Fonctions de convertion des différents éléments de SimplePDL en éléments de PetriNet |||||||||||
	
	private static void convertWorkDefinition(WorkDefinition wd) {
		
		// Les places de la WD
		Place p1 = myPetriFactory.createPlace();
		p1.setNbJetons(1);
		p1.setName(wd.getName()+"_ready");
		reseau.getReseauElements().add(p1);
		Place p2 = myPetriFactory.createPlace();
		p2.setName(wd.getName()+"_running");
		reseau.getReseauElements().add(p2);
		Place p3 = myPetriFactory.createPlace();
		p3.setName(wd.getName()+"_started");
		reseau.getReseauElements().add(p3);
		Place p4 = myPetriFactory.createPlace();
		p4.setName(wd.getName()+"_finished");
		reseau.getReseauElements().add(p4);
		
		// Les transitions
		Transition t1 = myPetriFactory.createTransition();
		t1.setName(wd.getName()+"_start");
		reseau.getReseauElements().add(t1);
		Transition t2 = myPetriFactory.createTransition();
		t2.setName(wd.getName()+"_finish");
		reseau.getReseauElements().add(t2);
		
		// Maintenant, on relie tout :)
		Arc a1 = myPetriFactory.createArc();
		a1.setNbTransfered(1);
		a1.setPlaceToTransition(true);
		a1.setPlace(p1);
		a1.setTransition(t1);
		reseau.getReseauElements().add(a1);
		
		Arc a2 = myPetriFactory.createArc();
		a2.setNbTransfered(1);
		a2.setPlaceToTransition(false);
		a2.setPlace(p2);
		a2.setTransition(t1);
		reseau.getReseauElements().add(a2);
		
		Arc a3 = myPetriFactory.createArc();
		a3.setNbTransfered(1);
		a3.setPlaceToTransition(false);
		a3.setPlace(p3);
		a3.setTransition(t1);
		reseau.getReseauElements().add(a3);
		
		Arc a4 = myPetriFactory.createArc();
		a4.setNbTransfered(1);
		a4.setPlaceToTransition(true);
		a4.setPlace(p2);
		a4.setTransition(t2);
		reseau.getReseauElements().add(a4);
		
		Arc a5 = myPetriFactory.createArc();
		a5.setNbTransfered(1);
		a5.setPlaceToTransition(false);
		a5.setPlace(p4);
		a5.setTransition(t2);
		reseau.getReseauElements().add(a5);
		
		// Pour finir, sauvegarde des points de liaisons pour pouvoir relier les éléments ensuite ^^
		addWorkDefinitionMapping(wd,p3,p4,t2,t1);
	}
	
	private static void convertWorkSequence(WorkSequence ws) {
		
		WorkDefinition predecessor = ws.getPredecessor();
		WorkDefinition successor = 	ws.getSuccessor();
		Arc arc = myPetriFactory.createArc();
		arc.setNbTransfered(1);
		arc.setIsReadArc(true);
    	arc.setPlaceToTransition(true);
		arc.setName(ws.getLinkType().toString());
		
		switch (ws.getLinkType()) {
	    case START_TO_START:
	        arc.setPlace(getHasStarted(predecessor));
	        arc.setTransition(getT2Started(successor));
	        break; // Ajout du break
	    case START_TO_FINISH:
	        arc.setPlace(getHasStarted(predecessor));
	        arc.setTransition(getT2Finished(successor));
	        break; // Ajout du break
	    case FINISH_TO_START:
	        arc.setPlace(getFinished(predecessor));
	        arc.setTransition(getT2Started(successor));
	        break; // Ajout du break
	    case FINISH_TO_FINISH:
	        arc.setPlace(getFinished(predecessor));
	        arc.setTransition(getT2Finished(successor));
	        break; // Ajout du break
		}
		
		reseau.getReseauElements().add(arc);
	}
	
	private static void convertRessourceAndNeeds(Ressource r) {
		
		// La ressource
		Place p = myPetriFactory.createPlace();
		p.setName(r.getName());
		p.setNbJetons(r.getQuantity());
		reseau.getReseauElements().add(p);
		
		//Maintenant, les needs
		EList<Need> needsList = r.getNeeds();
		needsList.stream()
	        .forEach(n -> {
	        	// Arc pour consommer les ressources quand l'activité débute
		        Arc arc = myPetriFactory.createArc();
				arc.setNbTransfered(n.getQuantityNeeded());
				arc.setPlaceToTransition(true);
				arc.setPlace(p);
				arc.setTransition(getT2Started(n.getWorkdefinition()));
				arc.setName("Need " + n.getQuantityNeeded());
				
				//Arc pour rendre les ressources quand l'activité finit
				Arc arc_rend = myPetriFactory.createArc();
				arc_rend.setNbTransfered(n.getQuantityNeeded());
				arc_rend.setPlaceToTransition(false);
				arc_rend.setPlace(p);
				arc_rend.setTransition(getT2Finished(n.getWorkdefinition()));
				arc_rend.setName("Give back " + n.getQuantityNeeded());
	        });
	}

	public static void main(String[] args) {
		
		// --------------------- Analyse des arguments & Loading des essentiels -----------------------------
		
		// Vérification que les arguments pour les chemins d'entrée et de sortie sont fournis
        if (args.length < 2) {
            System.out.println("Usage: java SimplePDLToPetriNet <input_model_path> <output_model_path>");
            return;
        }

        // Récupération des chemins d'entrée et de sortie à partir des arguments
        String inputModelPath = args[0];
        String outputModelPath = args[1];
		
		// Charger les packages SimplePDL & Petri afin de les enregistrer dans le registre d'Eclipse.
		@SuppressWarnings("unused")
		SimplepdlPackage packageInstancePdl = SimplepdlPackage.eINSTANCE;
		@SuppressWarnings("unused")
		PetriNetPackage packageInstancePetri = PetriNetPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant être ouverte à
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// ------------------------- Récupération du Process associé au fichier SimplePDL --------------------

		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (du modèle SimplePDL)
		ResourceSet resSetpdl = new ResourceSetImpl();
	
		// Charger la ressource (notre modèle)
		URI modelURIpdl = URI.createURI(inputModelPath);
		Resource resourcepdl = resSetpdl.getResource(modelURIpdl, true);
		
		// Récupérer le premier élément du modèle (élément racine)
		Process process = (Process) resourcepdl.getContents().get(0);
		
		
		
		// ------------------ Création du fichier xmi du modèle SimplePDL converti en Petri -------------------
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (du modèle Petri)
		ResourceSet resSetpetri = new ResourceSetImpl();

		// Définir la ressource (le modèle)
		URI modelURIpetri = URI.createURI(outputModelPath);
		Resource resourcepetri = resSetpetri.createResource(modelURIpetri);
		reseau = myPetriFactory.createReseau();
		reseau.setName(process.getName());
		resourcepetri.getContents().add(reseau);
		
		// ------------------------------------ Convertion -----------------------------------------------------
		
		EList<ProcessElement> processElementList = process.getProcessElements();
		
		// 1 - WorkDefinitions
        processElementList.stream()
            .filter(element -> element instanceof WorkDefinition)
            .forEach(wd -> convertWorkDefinition((WorkDefinition) wd));
        
        // 2 - WorkSequence
        processElementList.stream()
	        .filter(element -> element instanceof WorkSequence)
	        .forEach(ws -> convertWorkSequence((WorkSequence) ws));
        
        // 3 - Ressources et Needs
        processElementList.stream()
	        .filter(element -> element instanceof Ressource)
	        .forEach(r -> convertRessourceAndNeeds((Ressource) r));
        
        
        // --------------------------------------Sauvegarde Convertion ----------------------------------------
        try {
            Map<Object, Object> saveOptions = new HashMap<>();
            saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
            resourcepetri.save(saveOptions);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
