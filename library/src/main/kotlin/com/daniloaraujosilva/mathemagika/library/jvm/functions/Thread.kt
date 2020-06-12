package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Thread
 *
 * Full name:        System`Thread
 *
 *                   Thread[f[args]] "threads" f over any lists that appear in args.
 *                   Thread[f[args], h] threads f over any objects with head h that appear in args.
 * Usage:            Thread[f[args], h, n] threads f over objects with head h that appear in the first n args.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Thread
 * Documentation:    web: http://reference.wolfram.com/language/ref/Thread.html
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
fun thread(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Thread", arguments.toMutableList(), options)
}
