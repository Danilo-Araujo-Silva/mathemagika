package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransferFunctionFactor
 *
 * Full name:        System`TransferFunctionFactor
 *
 * Usage:            TransferFunctionFactor[tfm] factors the polynomial terms in the numerators and denominators of the TransferFunctionModel tfm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransferFunctionFactor
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionFactor.html
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
fun transferFunctionFactor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionFactor", arguments.toMutableList(), options)
}
