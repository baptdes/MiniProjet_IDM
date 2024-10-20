package miniProjet.XText2xmi;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import miniProjet.PDLXTextStandaloneSetup;

import java.io.IOException;

public class DSLToXMIConverter {

    public static void main(String[] args) {
        // Initialize the Xtext environment
        Injector injector = new PDLXTextStandaloneSetup().createInjectorAndDoEMFRegistration();

        // Create a resource set
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

        // Register XMI factory to handle XMI serialization
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Load your DSL model file
        Resource dslResource = resourceSet.getResource(URI.createURI("/home/nimdaba/Documents/N7/2A/IDM/MiniProjet_IDM/runtime-EclipseApplication/miniProjet.exemplesXtext/exemple.pdlxtext"), true);

        // Create a new resource for the XMI output
        Resource xmiResource = resourceSet.createResource(URI.createURI("/home/nimdaba/Documents/N7/2A/IDM/MiniProjet_IDM/runtime-EclipseApplication/miniProjet.exemplesXtext/exempleConverted.xmi"));

        // Add the contents of the DSL resource to the XMI resource
        xmiResource.getContents().add(dslResource.getContents().get(0));

        // Save the XMI resource to the file system
        try {
            xmiResource.save(null);
            System.out.println("Conversion to XMI successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
