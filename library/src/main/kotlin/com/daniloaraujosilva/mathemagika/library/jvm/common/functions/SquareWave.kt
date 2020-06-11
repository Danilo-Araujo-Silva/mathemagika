package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareWave
 *
 * Full name:        System`SquareWave
 *
 *                   SquareWave[x] gives a square wave that alternates between +1 and -1 with unit period.
 *                   SquareWave[{y , y }, x] gives a square wave that alternates between y  and y  with unit period.
 * Usage:                         1   2                                                   1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SquareWave
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareWave.html
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
fun squareWave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareWave", arguments.toMutableList(), options)
}
