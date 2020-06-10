package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseJacobiSD
 * 
 * Full name:        System`InverseJacobiSD
 * 
 *                                                                                      -1
 * Usage:            InverseJacobiSD[v, m] gives the inverse Jacobi elliptic function sd  (v  m).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseJacobiSD
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiSD.html
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
fun inverseJacobiSD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiSD", arguments.toMutableList(), options)
}
