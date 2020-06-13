package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TensorProduct
 *
 * Full name:        System`TensorProduct
 *
 *                   TensorProduct[tensor , tensor , …] represents the tensor product of the tensor .
 * Usage:                                1        2                                                i
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TensorProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorProduct.html
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
fun tensorProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorProduct", arguments.toMutableList(), options)
}
