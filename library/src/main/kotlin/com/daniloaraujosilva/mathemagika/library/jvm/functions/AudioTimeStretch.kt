package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioTimeStretch
 *
 * Full name:        System`AudioTimeStretch
 *
 * Usage:            AudioTimeStretch[audio, r] applies time stretching to audio by the specified factor r.
 *
 *                   Method -> Automatic
 * Options:          PartitionGranularity -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioTimeStretch
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioTimeStretch.html
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
fun audioTimeStretch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioTimeStretch", arguments.toMutableList(), options)
}
