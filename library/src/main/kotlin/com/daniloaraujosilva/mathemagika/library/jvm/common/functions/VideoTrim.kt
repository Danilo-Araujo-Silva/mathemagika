package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoTrim
 *
 * Full name:        System`VideoTrim
 *
 *                   VideoTrim[video, t] returns the first t seconds of video.
 *                   VideoTrim[video, -t] returns the last t seconds of video.
 *                   VideoTrim[video, {t , t }] returns video starting at time t  and ending at time t  of video.
 * Usage:                               1   2                                   1                     2
 *
 *                   AudioTracks -> All
 *                   SubtitleTracks -> All
 * Options:          VideoTracks -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoTrim
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoTrim.html
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
fun videoTrim(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoTrim", arguments.toMutableList(), options)
}
