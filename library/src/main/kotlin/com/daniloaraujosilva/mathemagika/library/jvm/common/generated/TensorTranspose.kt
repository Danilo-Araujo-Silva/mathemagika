package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TensorTranspose
 * 
 * Full name:        System`TensorTranspose
 * 
 * Usage:            TensorTranspose[tensor, perm] represents the tensor obtained by transposing the slots of tensor as given by the permutation perm.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TensorTranspose
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorTranspose.html
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
fun tensorTranspose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorTranspose", arguments.toMutableList(), options)
}
