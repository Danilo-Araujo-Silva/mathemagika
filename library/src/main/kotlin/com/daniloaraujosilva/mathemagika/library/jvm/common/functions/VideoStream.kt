package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoStream
 *
 * Full name:        System`VideoStream
 *
 *                   VideoStream[video] creates a new VideoStream object from video.
 * Usage:            VideoStream[id] is an object that represents a unique video stream.
 *
 *                   AudioOutputDevice -> Automatic
 *                   ImageSize -> Automatic
 *                   Looping -> False
 *                   RasterSize -> Automatic
 * Options:          SoundVolume -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoStream
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoStream.html
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
fun videoStream(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoStream", arguments.toMutableList(), options)
}
