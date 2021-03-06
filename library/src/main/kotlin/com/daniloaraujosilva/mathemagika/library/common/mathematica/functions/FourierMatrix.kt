package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FourierMatrix
 *
 * Full name:        System`FourierMatrix
 *
 * Usage:            FourierMatrix[n] returns an n×n Fourier matrix.
 *
 *                   FourierParameters -> {0, 1}
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierMatrix.html
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
fun fourierMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierMatrix", arguments.toMutableList(), options)
}
