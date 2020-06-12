package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BiweightLocation
 *
 * Full name:        System`BiweightLocation
 *
 *                   BiweightLocation[list] gives the value of the biweight location estimator of the elements in list.
 * Usage:            BiweightLocation[list, c] gives the value of the biweight location estimator with scaling parameter c.
 *
 *                   AccuracyGoal -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BiweightLocation
 * Documentation:    web: http://reference.wolfram.com/language/ref/BiweightLocation.html
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
fun biweightLocation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BiweightLocation", arguments.toMutableList(), options)
}
