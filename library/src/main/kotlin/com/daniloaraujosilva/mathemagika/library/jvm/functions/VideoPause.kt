package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoPause
 *
 * Full name:        System`VideoPause
 *
 *                   VideoPause[] pauses the playback of all VideoStream objects.
 *                   VideoPause[vstream] pauses the playback of the VideoStream object vstream.
 * Usage:            VideoPause[video] pauses the playback for all streams originated by video.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoPause
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoPause.html
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
fun videoPause(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoPause", arguments.toMutableList(), options)
}
