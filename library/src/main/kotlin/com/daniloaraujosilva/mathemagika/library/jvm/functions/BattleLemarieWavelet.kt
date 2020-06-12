package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BattleLemarieWavelet
 *
 * Full name:        System`BattleLemarieWavelet
 *
 *                   BattleLemarieWavelet[] represents the Battle–Lemarié wavelet of order 3.
 *                   BattleLemarieWavelet[n] represents the Battle–Lemarié wavelet of order n evaluated on equally spaced interval {-10, 10}.
 * Usage:            BattleLemarieWavelet[n, lim] represents the Battle–Lemarié wavelet of order n evaluated on equally spaced interval {-lim, lim}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BattleLemarieWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/BattleLemarieWavelet.html
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
fun battleLemarieWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BattleLemarieWavelet", arguments.toMutableList(), options)
}
