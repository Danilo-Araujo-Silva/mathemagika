package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveVideoStream
 *
 * Full name:        System`RemoveVideoStream
 *
 *                   RemoveVideoStream[] deletes all VideoStream objects.
 *                   RemoveVideoStream[stream] deletes the VideoStream object stream.
 * Usage:            RemoveAudioStream[video] deletes all the VideoStream objects stemming from video.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveVideoStream
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveVideoStream.html
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
fun removeVideoStream(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveVideoStream", arguments.toMutableList(), options)
}
