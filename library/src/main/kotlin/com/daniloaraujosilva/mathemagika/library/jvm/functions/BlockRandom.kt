package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BlockRandom
 *
 * Full name:        System`BlockRandom
 *
 * Usage:            BlockRandom[expr] evaluates expr with all pseudorandom generators localized, so that uses of SeedRandom, RandomInteger, and related functions within the evaluation of expr do not affect subsequent pseudorandom sequences.
 *
 * Options:          RandomSeeding -> Inherited
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BlockRandom
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockRandom.html
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
fun blockRandom(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockRandom", arguments.toMutableList(), options)
}
