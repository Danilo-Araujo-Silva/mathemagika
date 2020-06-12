package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultPrintPrecision
 *
 * Full name:        System`DefaultPrintPrecision
 *
 * Usage:            DefaultPrintPrecision is an option for NumberForm, DecimalForm and related functions that specifies the default number of digits of precision with which to print machine numbers.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultPrintPrecision
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultPrintPrecision.html
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
fun defaultPrintPrecision(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultPrintPrecision", arguments.toMutableList(), options)
}
