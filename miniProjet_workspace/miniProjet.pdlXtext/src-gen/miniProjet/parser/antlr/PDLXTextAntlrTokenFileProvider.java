/*
 * generated by Xtext 2.36.0
 */
package miniProjet.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PDLXTextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("miniProjet/parser/antlr/internal/InternalPDLXText.tokens");
	}
}
