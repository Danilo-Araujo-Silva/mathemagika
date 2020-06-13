package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConfidenceLevel
 *
 * Full name:        System`ConfidenceLevel
 *
 * Usage:            ConfidenceLevel is an option for LinearModelFit and other fitting functions that specifies the level to use in various confidence and prediction intervals and bands.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConfidenceLevel
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConfidenceLevel.html
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
fun confidenceLevel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConfidenceLevel", arguments.toMutableList(), options)
}
