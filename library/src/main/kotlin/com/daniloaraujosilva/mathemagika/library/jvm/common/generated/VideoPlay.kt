package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VideoPlay
 * 
 * Full name:        System`VideoPlay
 * 
 *                   VideoPlay[video] returns a new VideoStream object from video and starts the playback.
 * Usage:            VideoPlay[vstream] starts playing a VideoStream object vstream.
 * 
 * Options:          Looping -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VideoPlay
 * Documentation:    web: http://reference.wolfram.com/language/ref/VideoPlay.html
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
fun videoPlay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VideoPlay", arguments.toMutableList(), options)
}
