package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RescalingTransform
 *
 * Full name:        System`RescalingTransform
 *
 *                   RescalingTransform[{{x   , x   }, {y   , y   }, …}, {{xp   , xp   }, …}] gives a TransformationFunction that rescales the region with coordinate ranges x    to x   , etc. to the region with coordinate ranges xp    to xp   , etc.
 *                                         min   max     min   max           min    max                                                                                       min     max                                              min      max
 *                   RescalingTransform[{{x   , x   }, {y   , y   }, …}] gives a TransformationFunction that rescales to the unit square, cube, etc.
 * Usage:                                  min   max     min   max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RescalingTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/RescalingTransform.html
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
fun rescalingTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RescalingTransform", arguments.toMutableList(), options)
}
