package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseJacobiDS
 * 
 * Full name:        System`InverseJacobiDS
 * 
 *                                                                                      -1
 * Usage:            InverseJacobiDS[v, m] gives the inverse Jacobi elliptic function ds  (v  m).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseJacobiDS
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiDS.html
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
fun inverseJacobiDS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiDS", arguments.toMutableList(), options)
}
