package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpeechRecognize
 *
 * Full name:        System`SpeechRecognize
 *
 * Usage:            SpeechRecognize[audio] recognizes speech in audio and returns it as a string.
 *
 *                   Masking -> All
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpeechRecognize
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpeechRecognize.html
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
fun speechRecognize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpeechRecognize", arguments.toMutableList(), options)
}
