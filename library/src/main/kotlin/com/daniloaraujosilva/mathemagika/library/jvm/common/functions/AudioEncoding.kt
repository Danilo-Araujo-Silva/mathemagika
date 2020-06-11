package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioEncoding
 *
 * Full name:        System`AudioEncoding
 *
 * Usage:            AudioEncoding is an option for Export and other functions that specifies the audio encoding to use when creating an audio or a video file.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioEncoding
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioEncoding.html
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
fun audioEncoding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioEncoding", arguments.toMutableList(), options)
}
