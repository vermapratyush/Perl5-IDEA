/*
 * Copyright 2015 Alexandr Evstigneev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.perl5.lang.perl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.TokenSet;
import com.perl5.lang.perl.PerlParserDefinition;
import com.perl5.lang.perl.extensions.parser.PerlParserExtension;
import com.perl5.lang.perl.parser.builder.PerlBuilder;
import org.jetbrains.annotations.NotNull;

/**
 * Created by hurricup on 28.12.2015.
 */
public class PerlParserImpl extends PerlParserGenerated implements PerlParser
{
	public boolean parseStatement(PsiBuilder b, int l)
	{
		for (PerlParserExtension parserExtension : PerlParserDefinition.PARSER_EXTENSIONS)
		{
			if (parserExtension.parseStatement((PerlBuilder) b, l))
			{
				return true;
			}
		}
		return false;
	}

	public boolean parseTerm(PsiBuilder b, int l)
	{
		for (PerlParserExtension parserExtension : PerlParserDefinition.PARSER_EXTENSIONS)
		{
			if (parserExtension.parseTerm((PerlBuilder) b, l))
			{
				return true;
			}
		}
		return false;
	}

	@NotNull
	public TokenSet getBadCharacterForbiddenTokens()
	{
		return BAD_CHARACTER_FORBIDDEN_TOKENS;
	}

	@NotNull
	public TokenSet getStatementRecoveryTokens()
	{
		return STATEMENT_RECOVERY_TOKENS;
	}

	@NotNull
	public TokenSet getBlockRecoveryTokens()
	{
		return BLOCK_RECOVERY_TOKENS;
	}

	@NotNull
	public TokenSet getConsumableSemicolonTokens()
	{
		return CONSUMABLE_SEMI_TOKENS;
	}

	@NotNull
	public TokenSet getUnconsumableSemicolonTokens()
	{
		return UNCONSUMABLE_SEMI_TOKENS;
	}


}
