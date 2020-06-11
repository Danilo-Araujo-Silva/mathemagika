package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeometricBrownianMotionProcess
 *
 * Full name:        System`GeometricBrownianMotionProcess
 *
 *                   GeometricBrownianMotionProcess[μ, σ, x ] represents a geometric Brownian motion process with drift μ, volatility σ, and initial value x .
 * Usage:                                                  0                                                                                                0
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeometricBrownianMotionProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeometricBrownianMotionProcess.html
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
fun geometricBrownianMotionProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricBrownianMotionProcess", arguments.toMutableList(), options)
}
