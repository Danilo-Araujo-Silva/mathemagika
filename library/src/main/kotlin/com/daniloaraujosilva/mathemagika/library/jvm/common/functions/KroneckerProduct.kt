package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KroneckerProduct
 *
 * Full name:        System`KroneckerProduct
 *
 *                   KroneckerProduct[m , m , …] constructs the Kronecker product of the arrays m .
 * Usage:                              1   2                                                     i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KroneckerProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/KroneckerProduct.html
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
fun kroneckerProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KroneckerProduct", arguments.toMutableList(), options)
}
