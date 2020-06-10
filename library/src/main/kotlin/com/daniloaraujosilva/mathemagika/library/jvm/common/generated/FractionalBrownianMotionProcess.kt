package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FractionalBrownianMotionProcess
 * 
 * Full name:        System`FractionalBrownianMotionProcess
 * 
 *                   FractionalBrownianMotionProcess[μ, σ, h] represents fractional Brownian motion process with drift μ, volatility σ, and Hurst index h.
 * Usage:            FractionalBrownianMotionProcess[h] represents fractional Brownian motion process with drift 0, volatility 1, and Hurst index h.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FractionalBrownianMotionProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/FractionalBrownianMotionProcess.html
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
fun fractionalBrownianMotionProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FractionalBrownianMotionProcess", arguments.toMutableList(), options)
}
