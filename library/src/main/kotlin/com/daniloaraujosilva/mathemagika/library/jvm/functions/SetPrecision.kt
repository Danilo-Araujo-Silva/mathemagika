package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SetPrecision
 *
 * Full name:        System`SetPrecision
 *
 * Usage:            SetPrecision[expr, p] yields a version of expr in which all numbers have been set to have precision p.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetPrecision
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetPrecision.html
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
fun setPrecision(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetPrecision", arguments.toMutableList(), options)
}
