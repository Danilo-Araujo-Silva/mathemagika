package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MixedMagnitude
 *
 * Full name:        System`MixedMagnitude
 *
 *                   MixedMagnitude[{val , val , …, val }] represents a mixed-magnitude expression consisting of values val  through val .
 * Usage:                               1     2        n                                                                   1            n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MixedMagnitude
 * Documentation:    web: http://reference.wolfram.com/language/ref/MixedMagnitude.html
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
fun mixedMagnitude(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MixedMagnitude", arguments.toMutableList(), options)
}
