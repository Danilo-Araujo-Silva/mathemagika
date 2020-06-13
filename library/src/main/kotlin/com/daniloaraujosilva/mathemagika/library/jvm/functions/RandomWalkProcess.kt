package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RandomWalkProcess
 *
 * Full name:        System`RandomWalkProcess
 *
 *                   RandomWalkProcess[p] represents a random walk on a line with the probability of a positive unit step p and the probability of a negative unit step 1 - p.
 * Usage:            RandomWalkProcess[p, q] represents a random walk with the probability of a positive unit step p, the probability of a negative unit step q, and the probability of a zero step 1 - p - q.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomWalkProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomWalkProcess.html
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
fun randomWalkProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomWalkProcess", arguments.toMutableList(), options)
}
