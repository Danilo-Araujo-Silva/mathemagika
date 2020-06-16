package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioGenerator
 *
 * Full name:        System`AudioGenerator
 *
 *                   AudioGenerator[model] generates one second of audio of a given model.
 *                   AudioGenerator[model, t] generates t seconds of audio.
 * Usage:            AudioGenerator[model, t, "type"] generates audio samples of the specified "type".
 *
 *                   Appearance -> Automatic
 *                   AudioLabel -> Automatic
 *                   AudioOutputDevice -> Automatic
 *                   MetaInformation -> <||>
 *                   SampleRate -> 44100
 * Options:          SoundVolume -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioGenerator
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioGenerator.html
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
fun audioGenerator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioGenerator", arguments.toMutableList(), options)
}
