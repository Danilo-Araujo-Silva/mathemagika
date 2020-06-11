package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VideoFrameMap
 *
 * Full name:        System`VideoFrameMap
 *
 *                   VideoFrameMap[f, video] applies f to each frame of the Video object video, returning a new Video object.
 *                   VideoFrameMap[f, video, n] applies f to non-overlapping partitions of n video frames.
 * Usage:            VideoFrameMap[f, video, n, d] applies f to partitions with offset d.
 *
 *                   AudioEncoding -> Automatic
 *                   CompressionLevel -> 0.2
 *                   FrameRate -> Automatic
 *                   OverwriteTarget -> Automatic
 *                   SubtitleEncoding -> Automatic
 * Options:          VideoEncoding -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VideoFrameMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoFrameMap.html
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
fun videoFrameMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoFrameMap", arguments.toMutableList(), options)
}
