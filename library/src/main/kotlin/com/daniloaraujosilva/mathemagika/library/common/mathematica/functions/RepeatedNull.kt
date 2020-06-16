package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RepeatedNull
 *
 * Full name:        System`RepeatedNull
 *
 *                   p ... or RepeatedNull[p] is a pattern object that represents a sequence of zero or more expressions, each matching p.
 *                   RepeatedNull[p, max] represents from 0 to max expressions matching p.
 * Usage:            RepeatedNull[p, {min, max}] represents between min and max expressions matching p.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RepeatedNull
 * Documentation:    web: http://reference.wolfram.com/language/ref/RepeatedNull.html
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
fun repeatedNull(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RepeatedNull", arguments.toMutableList(), options)
}
