package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoExtractFrames
 *
 * Full name:        System`VideoExtractFrames
 *
 *                   VideoExtractFrames[video, t] extracts a frame at time t from video.
 * Usage:            VideoExtractFrames[video, tspec] extracts video frames at time specification tspec.
 *
 *                   MaxItems -> Infinity
 * Options:          VideoTracks -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoExtractFrames
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoExtractFrames.html
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
fun videoExtractFrames(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoExtractFrames", arguments.toMutableList(), options)
}
