package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BernoulliProcess
 * 
 * Full name:        System`BernoulliProcess
 * 
 * Usage:            BernoulliProcess[p] represents a Bernoulli process with event probability p.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BernoulliProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/BernoulliProcess.html
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
fun bernoulliProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BernoulliProcess", arguments.toMutableList(), options)
}
