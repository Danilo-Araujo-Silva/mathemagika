package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MAProcess
 *
 * Full name:        System`MAProcess
 *
 *                   MAProcess[{b , …, b }, v] represents a moving-average process of order q with normal white noise variance v.
 *                               1      q
 *                   MAProcess[{b , …, b }, Σ] represents a vector MA process with multinormal white noise covariance matrix Σ.
 *                               1      q
 *                   MAProcess[{b , …, b }, v, init] represents an MA process with initial data init.
 *                               1      q
 * Usage:            MAProcess[c, …] represents an MA process with a constant c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MAProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/MAProcess.html
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
fun mAProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MAProcess", arguments.toMutableList(), options)
}
