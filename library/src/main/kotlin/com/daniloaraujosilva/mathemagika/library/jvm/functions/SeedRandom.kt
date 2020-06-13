package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SeedRandom
 *
 * Full name:        System`SeedRandom
 *
 *                   SeedRandom[n] resets the pseudorandom generator, using n as a seed.
 * Usage:            SeedRandom[] resets the generator, using as a seed the time of day and certain attributes of the current Wolfram System session.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SeedRandom
 * Documentation:    web: http://reference.wolfram.com/language/ref/SeedRandom.html
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
fun seedRandom(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SeedRandom", arguments.toMutableList(), options)
}
