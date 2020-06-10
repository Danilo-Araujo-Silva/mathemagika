package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseJacobiNC
 * 
 * Full name:        System`InverseJacobiNC
 * 
 *                                                                                      -1
 * Usage:            InverseJacobiNC[v, m] gives the inverse Jacobi elliptic function nc  (v  m).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseJacobiNC
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiNC.html
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
fun inverseJacobiNC(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiNC", arguments.toMutableList(), options)
}
