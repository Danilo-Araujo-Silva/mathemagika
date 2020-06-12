package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageRestyle
 *
 * Full name:        System`ImageRestyle
 *
 *                   ImageRestyle[image, sample] attempts to restyle image so as to follow the graphical style of sample.
 *                   ImageRestyle[image, w  sample] uses restyle weighting w.
 *                   ImageRestyle[image, {sample , …}] attempts to restyle image using a blend of the graphical styles of the sample .
 *                                              1                                                                                   i
 *                   ImageRestyle[image, {w   sample , …}] uses weightings w  for the sample .
 * Usage:                                  1         1                       i               i
 *
 *                   PerformanceGoal -> Speed
 *                   PreserveColor -> False
 *                   RandomSeeding -> 1234
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageRestyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageRestyle.html
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
fun imageRestyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageRestyle", arguments.toMutableList(), options)
}
