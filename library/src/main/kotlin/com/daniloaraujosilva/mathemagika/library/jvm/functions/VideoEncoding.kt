package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoEncoding
 *
 * Full name:        System`VideoEncoding
 *
 * Usage:            VideoEncoding is an option for Export and other functions that specifies the video encoding to use when creating a video file.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoEncoding
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoEncoding.html
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
fun videoEncoding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoEncoding", arguments.toMutableList(), options)
}
