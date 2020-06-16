package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LanguageCategory
 *
 * Full name:        System`LanguageCategory
 *
 * Usage:            LanguageCategory is an option for Cell that determines in what category of language the contents of the cell should be assumed to be for purposes of spell checking and hyphenation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LanguageCategory
 * Documentation:    web: http://reference.wolfram.com/language/ref/LanguageCategory.html
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
fun languageCategory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LanguageCategory", arguments.toMutableList(), options)
}
