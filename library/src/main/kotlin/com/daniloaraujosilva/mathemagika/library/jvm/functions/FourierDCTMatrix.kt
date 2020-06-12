package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FourierDCTMatrix
 *
 * Full name:        System`FourierDCTMatrix
 *
 *                   FourierDCTMatrix[n] returns an n×n discrete cosine transform matrix of type 2.
 * Usage:            FourierDCTMatrix[n, m] returns an n×n discrete cosine transform matrix of type m.
 *
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierDCTMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierDCTMatrix.html
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
fun fourierDCTMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierDCTMatrix", arguments.toMutableList(), options)
}
