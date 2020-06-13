package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConfidenceTransform
 *
 * Full name:        System`ConfidenceTransform
 *
 * Usage:            ConfidenceTransform is an option for functions such as SurvivalModelFit that specifies the transformation used for confidence intervals and bands.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConfidenceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConfidenceTransform.html
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
fun confidenceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConfidenceTransform", arguments.toMutableList(), options)
}
