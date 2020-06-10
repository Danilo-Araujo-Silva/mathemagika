package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioChannels
 * 
 * Full name:        System`AudioChannels
 * 
 * Usage:            AudioChannels[audio] returns the number of channels in the Audio object audio.
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AudioChannels
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioChannels.html
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
fun audioChannels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioChannels", arguments.toMutableList(), options)
}
