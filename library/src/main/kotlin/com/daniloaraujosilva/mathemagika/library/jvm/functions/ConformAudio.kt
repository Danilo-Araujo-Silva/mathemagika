package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConformAudio
 *
 * Full name:        System`ConformAudio
 *
 *                   ConformAudio[{audio , audio , …}] returns a list of audio objects where all audio  are made to have conforming properties, including duration, data type, and number of channels.
 *                                      1       2                                                     i
 *                   ConformAudio[{audio , audio , …}, spec] returns all audio objects of the specified spec.
 * Usage:                               1       2
 *
 *                   Appearance -> Automatic
 *                   AudioLabel -> Automatic
 *                   AudioOutputDevice -> Automatic
 *                   MetaInformation -> Inherited
 *                   Padding -> Automatic
 *                   SampleRate -> Automatic
 * Options:          SoundVolume -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConformAudio
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConformAudio.html
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
fun conformAudio(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConformAudio", arguments.toMutableList(), options)
}
