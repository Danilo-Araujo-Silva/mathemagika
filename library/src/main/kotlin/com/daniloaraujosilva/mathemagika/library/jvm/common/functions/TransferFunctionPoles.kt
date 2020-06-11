package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransferFunctionPoles
 *
 * Full name:        System`TransferFunctionPoles
 *
 *                   TransferFunctionPoles[tfm] gives a matrix of roots of the denominators in the TransferFunctionModel tfm.
 * Usage:            TransferFunctionPoles[tfm, reg] only gives the roots inside the region reg on the complex plane.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransferFunctionPoles
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionPoles.html
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
fun transferFunctionPoles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionPoles", arguments.toMutableList(), options)
}
