package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             QRDecomposition
 *
 * Full name:        System`QRDecomposition
 *
 * Usage:            QRDecomposition[m] yields the QR decomposition for a numerical matrix m. The result is a list {q, r}, where q is a unitary matrix and r is an upper‐triangular matrix.
 *
 * Options:          Pivoting -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/QRDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/QRDecomposition.html
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
fun qRDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QRDecomposition", arguments.toMutableList(), options)
}
