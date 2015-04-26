package com.perl5.lang.perl.util;

import com.intellij.psi.tree.IElementType;
import com.perl5.lang.perl.lexer.PerlElementTypes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hurricup on 19.04.2015.
 */
public class PerlArrayUtil implements PerlElementTypes
{
	// @todo shouldn't we think about map search
	public static IElementType getArrayType(String array)
	{
		return BUILT_IN.contains(array)
				? PERL_VARIABLE_ARRAY_BUILT_IN
				: PERL_VARIABLE_ARRAY;
	}

	public static final ArrayList<String> BUILT_IN = new ArrayList<String>( Arrays.asList(
			"@+",
			"@-",
			"@_",
			"@ARGV",
			"@INC",
			"@LAST_MATCH_START",

			// hash slices
			"@!",
			"@+",
			"@-",
			"@^H",
			"@ENV",
			"@INC",
			"@OVERLOAD",
			"@SIG"
	));
}