package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoStop
 *
 * Full name:        System`VideoStop
 *
 *                   VideoStop[] stops the playback of all VideoStream objects.
 *                   VideoStop[vstream] stops the playback of the VideoStream object vstream.
 * Usage:            VideoStop[video] stops the playback for all streams originated by video.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoStop
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoStop.html
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
fun videoStop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoStop", arguments.toMutableList(), options)
}
