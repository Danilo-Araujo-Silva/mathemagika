package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StateResponse
 *
 * Full name:        System`StateResponse
 *
 *                   StateResponse[sys, u, {t, t   , t   }] gives the numeric state response of the state-space model sys to input u for t    ≤ t ≤ t   .
 *                                              min   max                                                                                 min        max
 *                   StateResponse[sys, {u[0], u[1], …}] gives the response of the discrete-time state-space model sys to the input sequence u[i].
 *                   StateResponse[sys, u, t] gives the symbolic state response as a function of time t.
 *                   StateResponse[sys, {u , …, u }, …] gives the state response for multiple inputs u .
 *                                        1      m                                                    i
 *                   StateResponse[{sys, {x  , x  , …, x  }}, …, …] gives the response with initial states x  .
 * Usage:                                  10   20      n0                                                  i0
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StateResponse
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateResponse.html
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
fun stateResponse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateResponse", arguments.toMutableList(), options)
}
