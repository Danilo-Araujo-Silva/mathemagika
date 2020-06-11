package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EstimatedBackground
 *
 * Full name:        System`EstimatedBackground
 *
 *                   EstimatedBackground[data] estimates the background of data.
 * Usage:            EstimatedBackground[data, σ] tries to preserve peaks up to scale σ.
 *
 *                   Method -> Automatic
 * Options:          Padding -> Reversed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EstimatedBackground
 * Documentation:    web: http://reference.wolfram.com/language/ref/EstimatedBackground.html
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
fun estimatedBackground(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EstimatedBackground", arguments.toMutableList(), options)
}
