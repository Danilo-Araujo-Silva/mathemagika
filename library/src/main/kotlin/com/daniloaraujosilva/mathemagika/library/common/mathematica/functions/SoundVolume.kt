package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SoundVolume
 *
 * Full name:        System`SoundVolume
 *
 * Usage:            SoundVolume is an option to Sound and SoundNote and related functions that specifies the relative volume of the sound produced.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SoundVolume
 * Documentation:    web: http://reference.wolfram.com/language/ref/SoundVolume.html
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
fun soundVolume(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SoundVolume", arguments.toMutableList(), options)
}
