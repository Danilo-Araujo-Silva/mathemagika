package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RandomSeeding
 *
 * Full name:        System`RandomSeeding
 *
 * Usage:            RandomSeeding is an option that specifies what seeding of pseudorandom generators should be done inside the operation of a function.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomSeeding
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomSeeding.html
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
fun randomSeeding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomSeeding", arguments.toMutableList(), options)
}
