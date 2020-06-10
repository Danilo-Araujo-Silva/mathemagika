package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioPan
 * 
 * Full name:        System`AudioPan
 * 
 *                   AudioPan[audio] returns a center-panned stereo audio object from a mono audio. 
 * Usage:            AudioPan[audio, pan] returns a stereo audio object after panning left and right channels using the specified pan.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioPan
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioPan.html
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
fun audioPan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioPan", arguments.toMutableList(), options)
}
