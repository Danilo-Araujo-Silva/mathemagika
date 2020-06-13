package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ResamplingMethod
 *
 * Full name:        System`ResamplingMethod
 *
 * Usage:            ResamplingMethod is an option for functions such as TemporalData and MovingMap that specifies how values in between given times should be computed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResamplingMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResamplingMethod.html
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
fun resamplingMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResamplingMethod", arguments.toMutableList(), options)
}
