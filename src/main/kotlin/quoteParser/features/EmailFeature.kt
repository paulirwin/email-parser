/*
 * Copyright 2016-2017 JetBrains s.r.o.
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

package quoteParser.features

import org.intellij.lang.annotations.Language

class EmailFeature() : AbstractQuoteFeature() {
    override val name: String
        get() = "EMAIL"

    override fun getRegex(): Regex {
        // Full regex for testing needs
        @Language("RegExp")
        val regex = "(.*[\\s\\p{C}\\p{Z}>])?\\S+@\\S+([\\p{C}\\p{Z}\\s].*)?"

        // @ symbol surrounded with at least one non-whitespace symbol.
        return Regex("${this.startWhitespaceOptional}\\S+@\\S+${this.endWhitespaceOptional}")
    }

}