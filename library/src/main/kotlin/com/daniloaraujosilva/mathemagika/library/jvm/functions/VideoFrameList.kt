package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VideoFrameList
 *
 * Full name:        System`VideoFrameList
 *
 * Usage:            VideoFrameList[video, n] gives a list of n images extracted from video.
 *
 *                   Method -> Automatic
 * Options:          VideoTracks -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoFrameList
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoFrameList.html
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
fun videoFrameList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoFrameList", arguments.toMutableList(), options)
}
