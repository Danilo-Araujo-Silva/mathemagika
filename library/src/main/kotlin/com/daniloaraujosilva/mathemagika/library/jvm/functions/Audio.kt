package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Audio
 *
 * Full name:        System`Audio
 *
 *                   Audio[file] represents audio stored in the given file.
 *                   Audio[url] represents audio stored in the given URL.
 * Usage:            Audio[data] represents audio with samples given by the array data.
 *
 *                   AnnotationRules -> None
 *                   Appearance -> Automatic
 *                   AudioChannelAssignment -> Automatic
 *                   AudioLabel -> Automatic
 *                   AudioOutputDevice -> Automatic
 *                   MetaInformation -> <||>
 *                   SampleRate -> Automatic
 * Options:          SoundVolume -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Audio
 * Documentation:    web: http://reference.wolfram.com/language/ref/Audio.html
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
fun audio(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Audio", arguments.toMutableList(), options)
}
