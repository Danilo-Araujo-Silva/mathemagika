package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TextTranslation
 *
 * Full name:        System`TextTranslation
 *
 *                   TextTranslation["text"] translates text into the current default language.
 *                   TextTranslation["text", lang] translates text into the language specified by lang.
 *                   TextTranslation["text", lang   lang ] translates text from language lang  to lang .
 * Usage:                                        1       2                                    1        2
 *
 *                   LanguageRules -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TextTranslation
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextTranslation.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun textTranslation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextTranslation", arguments.toMutableList(), options)
}
