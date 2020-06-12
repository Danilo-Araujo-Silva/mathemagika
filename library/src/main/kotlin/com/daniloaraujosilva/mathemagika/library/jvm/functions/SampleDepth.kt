package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SampleDepth
 *
 * Full name:        System`SampleDepth
 *
 * Usage:            SampleDepth is an option for sound primitives that specifies how many bits should be used to encode sound amplitude levels.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SampleDepth
 * Documentation:    web: http://reference.wolfram.com/language/ref/SampleDepth.html
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
fun sampleDepth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SampleDepth", arguments.toMutableList(), options)
}
