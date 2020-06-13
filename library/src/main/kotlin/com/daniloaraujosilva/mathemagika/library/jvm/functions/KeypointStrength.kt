package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KeypointStrength
 *
 * Full name:        System`KeypointStrength
 *
 * Usage:            KeypointStrength is an option for ImageKeypoints and related functions to specify a minimum strength of detected keypoints.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KeypointStrength
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeypointStrength.html
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
fun keypointStrength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeypointStrength", arguments.toMutableList(), options)
}
