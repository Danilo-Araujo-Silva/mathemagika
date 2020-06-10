package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BrownianBridgeProcess
 * 
 * Full name:        System`BrownianBridgeProcess
 * 
 *                   BrownianBridgeProcess[σ, {t , a}, {t , b}] represents the Brownian bridge process from value a at time t  to value b at time t  with volatility σ.
 *                                              1        2                                                                   1                     2
 *                   BrownianBridgeProcess[{t , a}, {t , b}]  represents the standard Brownian bridge process from value a at time t  to value b at time t .
 *                                           1        2                                                                             1                     2
 *                   BrownianBridgeProcess[t , t ]  represents the standard Brownian bridge process pinned at 0 at times t  and t .
 *                                          1   2                                                                         1      2
 * Usage:            BrownianBridgeProcess[] represents the standard Brownian bridge process pinned at 0 at time 0 and at time 1.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BrownianBridgeProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/BrownianBridgeProcess.html
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
fun brownianBridgeProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BrownianBridgeProcess", arguments.toMutableList(), options)
}
