package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Video
 *
 * Full name:        System`Video
 *
 *                   Video[file] represents video stored in the given file.
 * Usage:            Video[url] represents video stored in the given URL.
 *
 *                   Appearance -> Automatic
 *                   AudioOutputDevice -> Automatic
 *                   ImageSize -> Automatic
 *                   RasterSize -> Automatic
 * Options:          SoundVolume -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Video
 * Documentation:    web: http://reference.wolfram.com/language/ref/Video.html
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
fun video(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Video", arguments.toMutableList(), options)
}
