package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EstimatorGains
 * 
 * Full name:        System`EstimatorGains
 * 
 *                   EstimatorGains[ssm, {p , p , …, p }] gives the estimator gain matrix for the StateSpaceModel ssm, such that the poles of the estimator are p .
 *                                         1   2      n                                                                                                          i
 *                   EstimatorGains[{ssm, {out , …}}, …] specifies the measured outputs out  to use.
 * Usage:                                     1                                            i
 * 
 *                   Method -> Automatic
 * Options:          Tolerance -> 0.01
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EstimatorGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/EstimatorGains.html
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
fun estimatorGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EstimatorGains", arguments.toMutableList(), options)
}
