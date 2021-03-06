package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubtitleTracks
 *
 * Full name:        System`SubtitleTracks
 *
 * Usage:            SubtitleTracks is an option that specifies the subtitle tracks of interest.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubtitleTracks
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubtitleTracks.html
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
fun subtitleTracks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubtitleTracks", arguments.toMutableList(), options)
}
