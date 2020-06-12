package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Threshold
 *
 * Full name:        System`Threshold
 *
 *                   Threshold[data] thresholds data by replacing values close to zero by zero.
 *                   Threshold[data, tspec] thresholds data using threshold specification tspec.
 *                   Threshold[image, …] thresholds an image.
 * Usage:            Threshold[sound, …] thresholds a sound object.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Threshold
 * Documentation:    web: http://reference.wolfram.com/language/ref/Threshold.html
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
fun threshold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Threshold", arguments.toMutableList(), options)
}
