package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ChessboardDistance
 *
 * Full name:        System`ChessboardDistance
 *
 * Usage:            ChessboardDistance[u, v] gives the chessboard, Chebyshev, or sup norm distance between vectors u and v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChessboardDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChessboardDistance.html
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
fun chessboardDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChessboardDistance", arguments.toMutableList(), options)
}
