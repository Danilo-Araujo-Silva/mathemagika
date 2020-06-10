package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseJacobiCD
 * 
 * Full name:        System`InverseJacobiCD
 * 
 *                                                                                      -1
 * Usage:            InverseJacobiCD[v, m] gives the inverse Jacobi elliptic function cd  (v  m).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseJacobiCD
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiCD.html
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
fun inverseJacobiCD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiCD", arguments.toMutableList(), options)
}
