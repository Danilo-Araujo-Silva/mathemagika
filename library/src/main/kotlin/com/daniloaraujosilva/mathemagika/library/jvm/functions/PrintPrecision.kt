package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrintPrecision
 *
 * Full name:        System`PrintPrecision
 *
 * Usage:            PrintPrecision is an option for selections that specifies the maximum number of digits used for displaying a machine-precision number.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrintPrecision
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrintPrecision.html
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
fun printPrecision(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrintPrecision", arguments.toMutableList(), options)
}
