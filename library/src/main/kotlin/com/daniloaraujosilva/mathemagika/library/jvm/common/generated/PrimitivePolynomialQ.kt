package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PrimitivePolynomialQ
 * 
 * Full name:        System`PrimitivePolynomialQ
 * 
 * Usage:            PrimitivePolynomialQ[poly, p] tests whether poly is a primitive polynomial modulo a prime p.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PrimitivePolynomialQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimitivePolynomialQ.html
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
fun primitivePolynomialQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimitivePolynomialQ", arguments.toMutableList(), options)
}
