package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioChannelSeparate
 * 
 * Full name:        System`AudioChannelSeparate
 * 
 *                   AudioChannelSeparate[audio] gives a list of Audio objects, each of which represents one channel of audio.
 * Usage:            AudioChannelSeparate[audio, channel] returns the specified channel from audio.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AudioChannelSeparate
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioChannelSeparate.html
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
fun audioChannelSeparate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioChannelSeparate", arguments.toMutableList(), options)
}
