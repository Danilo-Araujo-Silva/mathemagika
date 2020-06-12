package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FacialFeatures
 *
 * Full name:        System`FacialFeatures
 *
 *                   FacialFeatures[image] returns a minimal summary of facial features for all detected faces in image.
 * Usage:            FacialFeatures[image, features] returns the specified facial features.
 *
 *                   Method -> Automatic
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FacialFeatures
 * Documentation:    web: http://reference.wolfram.com/language/ref/FacialFeatures.html
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
fun facialFeatures(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FacialFeatures", arguments.toMutableList(), options)
}
