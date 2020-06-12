package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Interval
 *
 * Full name:        System`Interval
 *
 *                   Interval[{min, max}] represents the range of values between min and max.
 *                   Interval[{min , max }, {min , max }, …] represents the union of the ranges min  to max , min  to max , ….
 * Usage:                         1     1       2     2                                            1       1     2       2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Interval
 * Documentation:    web: http://reference.wolfram.com/language/ref/Interval.html
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
fun interval(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Interval", arguments.toMutableList(), options)
}
