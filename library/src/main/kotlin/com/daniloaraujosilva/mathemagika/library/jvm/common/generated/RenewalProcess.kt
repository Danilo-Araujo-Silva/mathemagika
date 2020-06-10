package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RenewalProcess
 * 
 * Full name:        System`RenewalProcess
 * 
 * Usage:            RenewalProcess[rdist] represents a renewal process with interarrival times distributed according to rdist.
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RenewalProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/RenewalProcess.html
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
fun renewalProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RenewalProcess", arguments.toMutableList(), options)
}
