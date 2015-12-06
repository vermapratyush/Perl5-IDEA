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

package com.perl5.lang.perl.lexer;

import com.btr.proxy.search.browser.ie.IELocalByPassFilter;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hurricup on 06.12.2015.
 * Helper methods for perl lexers
 */
public class PerlLexerUtil implements PerlElementTypes
{
	public static final TokenSet IMMUTABLE_TOKEN_SET = TokenSet.create(
			TokenType.WHITE_SPACE,
			TokenType.NEW_LINE_INDENT
	);

	public static final Map<IElementType, IElementType> TOKENS_MAP = new HashMap<IElementType, IElementType>();
	public static final TokenSet STRING_CONTENT_TOKENS;

	static
	{
		TOKENS_MAP.put(OPERATOR_PLUS, STRING_PLUS);
		TOKENS_MAP.put(IDENTIFIER, STRING_IDENTIFIER);

		TOKENS_MAP.put(PACKAGE, STRING_PACKAGE);
		TOKENS_MAP.put(PACKAGE_IDENTIFIER, STRING_PACKAGE);
		TOKENS_MAP.put(PACKAGE_CORE_IDENTIFIER, STRING_PACKAGE);

		STRING_CONTENT_TOKENS = TokenSet.orSet(
				TokenSet.create(TOKENS_MAP.values().toArray(new IElementType[TOKENS_MAP.values().size()])),
				TokenSet.create(STRING_CONTENT)
		);
	}

	public static IElementType remapSQToken(IElementType tokenType)
	{
		if (tokenType == null || IMMUTABLE_TOKEN_SET.contains(tokenType))
		{
			return tokenType;
		}

		IElementType newTokenType = null;
		if ((newTokenType = TOKENS_MAP.get(tokenType)) != null)
		{
			return newTokenType;
		}

		return STRING_CONTENT;

	}
}
