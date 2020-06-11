package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConversionRules
 *
 * Full name:        System`ConversionRules
 *
 * Usage:            ConversionRules is an option for Cell that can be set to a list of rules specifying how the contents of the cell are to be converted to external formats.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConversionRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConversionRules.html
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
fun conversionRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConversionRules", arguments.toMutableList(), options)
}
