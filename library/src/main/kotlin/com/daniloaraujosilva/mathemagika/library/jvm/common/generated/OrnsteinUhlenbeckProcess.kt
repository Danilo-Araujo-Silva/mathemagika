package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             OrnsteinUhlenbeckProcess
 * 
 * Full name:        System`OrnsteinUhlenbeckProcess
 * 
 *                   OrnsteinUhlenbeckProcess[μ, σ, θ] represents a stationary Ornstein–Uhlenbeck process with long-term mean μ, volatility σ, and mean reversion speed θ. 
 *                   OrnsteinUhlenbeckProcess[μ, σ, θ, x ] represents an Ornstein–Uhlenbeck process with initial condition x .
 * Usage:                                               0                                                                   0
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/OrnsteinUhlenbeckProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrnsteinUhlenbeckProcess.html
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
fun ornsteinUhlenbeckProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrnsteinUhlenbeckProcess", arguments.toMutableList(), options)
}
