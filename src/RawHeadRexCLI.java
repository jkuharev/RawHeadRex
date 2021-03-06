import org.apache.commons.cli.Option;

import de.mz.jk.jsix.cli.SimpleCLI;

/** RawHeadRex, , Dec 14, 2017*/
/**
 * <h3>{@link RawHeadRexCLI}</h3>
 * @author jkuharev
 * @version Dec 14, 2017 2:36:08 PM
 */
public class RawHeadRexCLI extends SimpleCLI
{
	public RawHeadRexCLI()
	{
		super();
		setHelpHeader(
				"\nExtract value of a key from Waters Raw file properties\n"
						+ " that are stored in `_HEADER.txt` or `_extern.inf` files.\n\n" );
		setHelpFooter( "\nRawHeadRex, build " + RawHeadRex.buildVersion + "\n (c) Dr. Joerg Kuharev" );
	}

	@Override public Option[] getDefaultOptions()
	{
		return new Option[] {
				Option.builder( "i" ).longOpt( "input" ).argName( "header file" ).desc( "path to _HEADER.TXT or _extern.inf file" ).hasArg().required( true ).build(),
				Option.builder( "o" ).longOpt( "output" ).argName( "file" ).desc( "path to a new value separated file [STDIO]" ).hasArg().required( false ).build(),
				Option.builder( "k" ).longOpt( "key" ).argName( "string" ).desc( "key name pattern []" ).hasArg().required( false ).build(),
				Option.builder( "c" ).longOpt( "colsep" ).argName( "string" ).desc( "column separator character [,]" ).hasArg().required( false ).build(),
				Option.builder( "s" ).longOpt( "substring" ).argName( "position" ).desc( "trim value to substring [0]" ).hasArg().required( false ).build(),
				Option.builder( "w" ).longOpt( "wordify" ).desc( "replace non-word characters by _ in key names" ).hasArg( false ).required( false ).build(),
				Option.builder( "v" ).longOpt( "value-only" ).desc( "return only the value" ).hasArg( false ).required( false ).build(),
				getDefaultHelpOption(),
		};
	}

	@Override public String getExecutableJarFileName()
	{
		return "RawHeadRex";
	}
}
