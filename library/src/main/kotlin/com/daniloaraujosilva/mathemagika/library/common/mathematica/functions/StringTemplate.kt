package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StringTemplate
 *
 * Full name:        System`StringTemplate
 *
 *                   StringTemplate["string"] yields a TemplateObject expression that represents a string template to be applied to arguments.
 *                   StringTemplate[src] uses File[…], URL[…] or CloudObject[…] as the source for the string template.
 * Usage:            StringTemplate[form, args] yields a TemplateObject with arguments, suitable for cloud deployment or other evaluation.
 *
 *                   CombinerFunction -> StringJoin
 *                   Delimiters -> Automatic
 * Options:          InsertionFunction -> TextString
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StringTemplate
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringTemplate.html
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
fun stringTemplate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringTemplate", arguments.toMutableList(), options)
}
