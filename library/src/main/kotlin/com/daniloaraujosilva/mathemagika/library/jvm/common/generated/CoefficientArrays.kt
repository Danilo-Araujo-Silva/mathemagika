package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoefficientArrays
 * 
 * Full name:        System`CoefficientArrays
 * 
 * Usage:            CoefficientArrays[polys, vars] gives the arrays of coefficients of the variables vars in the polynomials polys. 
 * 
 * Options:          Symmetric -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CoefficientArrays
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoefficientArrays.html
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
fun coefficientArrays(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoefficientArrays", arguments.toMutableList(), options)
}
