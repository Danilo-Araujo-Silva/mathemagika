package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteChirpZTransform
 *
 * Full name:        System`DiscreteChirpZTransform
 *
 *                   DiscreteChirpZTransform[list] gives the chirp Z transform of list.
 *                   DiscreteChirpZTransform[list, n] returns a length n chirp Z transform.
 *                   DiscreteChirpZTransform[list, n, w] uses a spiral path on the complex z plane defined by w.
 *                   DiscreteChirpZTransform[list, n, w, a] uses a as the complex starting point.
 *                   DiscreteChirpZTransform[list, {n , n , …}, {w , w , …}, {a , a , …}] gives the multidimensional chirp Z transform.
 * Usage:                                            1   2        1   2        1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteChirpZTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteChirpZTransform.html
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
fun discreteChirpZTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteChirpZTransform", arguments.toMutableList(), options)
}
