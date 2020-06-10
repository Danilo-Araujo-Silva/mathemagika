package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TransferFunctionZeros
 * 
 * Full name:        System`TransferFunctionZeros
 * 
 *                   TransferFunctionZeros[tfm] gives a matrix of roots of the numerators in the TransferFunctionModel tfm.
 * Usage:            TransferFunctionZeros[tfm, reg] only gives the roots inside the region reg on the complex plane.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TransferFunctionZeros
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionZeros.html
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
fun transferFunctionZeros(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionZeros", arguments.toMutableList(), options)
}
