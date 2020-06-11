package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransferFunctionExpand
 *
 * Full name:        System`TransferFunctionExpand
 *
 * Usage:            TransferFunctionExpand[tfm] expands polynomial terms in the numerators and denominators of the TransferFunctionModel tfm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransferFunctionExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionExpand.html
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
fun transferFunctionExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionExpand", arguments.toMutableList(), options)
}
