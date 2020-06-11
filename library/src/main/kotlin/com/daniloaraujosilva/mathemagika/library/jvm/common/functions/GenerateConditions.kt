package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateConditions
 *
 * Full name:        System`GenerateConditions
 *
 * Usage:            GenerateConditions is an option for Integrate, Sum, and similar functions that specifies whether explicit conditions on parameters should be generated in the result.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GenerateConditions
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateConditions.html
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
fun generateConditions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateConditions", arguments.toMutableList(), options)
}
