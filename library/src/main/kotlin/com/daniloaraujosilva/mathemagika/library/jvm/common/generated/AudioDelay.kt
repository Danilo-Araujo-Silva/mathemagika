package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioDelay
 * 
 * Full name:        System`AudioDelay
 * 
 *                   AudioDelay[audio, delay] creates audio by adding repeated decaying echos to audio spaced by the specified delay.
 *                   AudioDelay[audio, delay, feedback] uses the specified feedback as the amount of signal to preserve during each repetition.
 * Usage:            AudioDelay[audio, delay, feedback, mix] uses mix to control the ratio between original and delayed audio.
 * 
 *                   Method -> Automatic
 * Options:          PaddingSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioDelay
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioDelay.html
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
fun audioDelay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioDelay", arguments.toMutableList(), options)
}
