package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KirchhoffMatrix
 *
 * Full name:        System`KirchhoffMatrix
 *
 *                   KirchhoffMatrix[g] gives the Kirchhoff matrix of the graph g.
 * Usage:            KirchhoffMatrix[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KirchhoffMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/KirchhoffMatrix.html
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
fun kirchhoffMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KirchhoffMatrix", arguments.toMutableList(), options)
}
