package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioFade
 * 
 * Full name:        System`AudioFade
 * 
 *                   AudioFade[audio] returns audio in which the beginning and end of audio are faded.
 *                   AudioFade[audio, t] fades the first and last t seconds of audio.
 *                   AudioFade[audio, {t , t }] fades t  seconds at the beginning and t  seconds at the end.
 * Usage:                               1   2          1                               2
 * 
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioFade
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioFade.html
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
fun audioFade(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioFade", arguments.toMutableList(), options)
}
