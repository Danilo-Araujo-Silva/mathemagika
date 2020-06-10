package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoxIngersollRossProcess
 * 
 * Full name:        System`CoxIngersollRossProcess
 * 
 *                   CoxIngersollRossProcess[μ, σ, θ, x ] represents a Cox–Ingersoll–Ross process with long‐term mean μ, volatility σ, speed of adjustment θ, and initial condition x .
 * Usage:                                              0                                                                                                                             0
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CoxIngersollRossProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoxIngersollRossProcess.html
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
fun coxIngersollRossProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoxIngersollRossProcess", arguments.toMutableList(), options)
}
