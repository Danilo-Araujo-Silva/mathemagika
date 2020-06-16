package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TransferFunctionCancel
 *
 * Full name:        System`TransferFunctionCancel
 *
 *                   TransferFunctionCancel[tfm] cancels common poles and zeros in the TransferFunctionModel tfm.
 *                   TransferFunctionCancel[tfm, crit] cancels only common pole-zero pairs e  for which crit[e ] is True.
 * Usage:                                                                                   i                 i
 *
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransferFunctionCancel
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionCancel.html
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
fun transferFunctionCancel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionCancel", arguments.toMutableList(), options)
}
