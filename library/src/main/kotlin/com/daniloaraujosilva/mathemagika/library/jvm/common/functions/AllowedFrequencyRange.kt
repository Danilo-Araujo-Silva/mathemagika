package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AllowedFrequencyRange
 *
 * Full name:        System`AllowedFrequencyRange
 *
 * Usage:            AllowedFrequencyRange is an option for audio and signal processing functions that specifies the range of frequencies of interest.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AllowedFrequencyRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowedFrequencyRange.html
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
fun allowedFrequencyRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowedFrequencyRange", arguments.toMutableList(), options)
}
