package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BrightnessEqualize
 *
 * Full name:        System`BrightnessEqualize
 *
 *                   BrightnessEqualize[image] adjusts the brightness across image, correcting uneven illumination.
 *                   BrightnessEqualize[image, flatfield] uses the correction model given by flatfield, which models the variation in brightness across image.
 * Usage:            BrightnessEqualize[image, flatfield, darkfield] uses the dark environment model given by darkfield.
 *
 *                   Masking -> Automatic
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BrightnessEqualize
 * Documentation:    web: http://reference.wolfram.com/language/ref/BrightnessEqualize.html
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
fun brightnessEqualize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BrightnessEqualize", arguments.toMutableList(), options)
}
