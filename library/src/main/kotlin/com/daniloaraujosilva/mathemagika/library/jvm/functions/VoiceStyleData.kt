package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VoiceStyleData
 *
 * Full name:        System`VoiceStyleData
 *
 *                   VoiceStyleData[] gives the list of available voices for speech synthesis.
 *                   VoiceStyleData[voice] returns all properties for the specified voice.
 * Usage:            VoiceStyleData[voice, prop] returns the specified property prop for voice.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VoiceStyleData
 * Documentation:    web: http://reference.wolfram.com/language/ref/VoiceStyleData.html
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
fun voiceStyleData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VoiceStyleData", arguments.toMutableList(), options)
}
