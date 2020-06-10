package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioReverb
 * 
 * Full name:        System`AudioReverb
 * 
 *                   AudioReverb[audio] adds reverberation to audio.
 *                   AudioReverb[audio, model] adds reverberation following the room model.
 * Usage:            AudioReverb[audio, model, mix] controls the mix ratio between original and reverberated audio.
 * 
 * Options:          PaddingSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioReverb
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioReverb.html
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
fun audioReverb(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioReverb", arguments.toMutableList(), options)
}
