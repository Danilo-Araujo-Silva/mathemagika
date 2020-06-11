package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FourierDSTMatrix
 *
 * Full name:        System`FourierDSTMatrix
 *
 *                   FourierDSTMatrix[n] returns an n×n discrete sine transform matrix of type 2.
 * Usage:            FourierDSTMatrix[n, m] returns an n×n discrete sine transform matrix of type m.
 *
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierDSTMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierDSTMatrix.html
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
fun fourierDSTMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierDSTMatrix", arguments.toMutableList(), options)
}
