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

package com.perl5.lang.perl.psi.utils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hurricup on 01.06.2015.
 */
public abstract class PerlThisNames
{
	public final static Set<String> NAMES_SET = new HashSet<String>();

	static
	{
		NAMES_SET.add("this");
		NAMES_SET.add("self");
		NAMES_SET.add("proto");
		NAMES_SET.add("class");
	}
}
