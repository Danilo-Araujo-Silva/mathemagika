package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PermutationProduct
 * 
 * Full name:        System`PermutationProduct
 * 
 * Usage:            PermutationProduct[a, b, c] gives the product of permutations a, b, c.
 * 
 * Options:          None
 * 
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PermutationProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationProduct.html
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
fun permutationProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationProduct", arguments.toMutableList(), options)
}
