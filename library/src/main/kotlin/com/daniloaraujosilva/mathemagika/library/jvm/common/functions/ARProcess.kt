package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ARProcess
 *
 * Full name:        System`ARProcess
 *
 *                   ARProcess[{a , …, a }, v] represents a weakly stationary autoregressive process of order p with normal white noise variance v.
 *                               1      p
 *                   ARProcess[{a , …, a }, Σ] represents a weakly stationary vector AR process with multinormal white noise covariance matrix Σ.
 *                               1      p
 *                   ARProcess[{a , …, a }, v, init] represents an AR process with initial data init.
 *                               1      p
 * Usage:            ARProcess[c, …] represents an AR process with a constant c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ARProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/ARProcess.html
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
fun aRProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ARProcess", arguments.toMutableList(), options)
}
