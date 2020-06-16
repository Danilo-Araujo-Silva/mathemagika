package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageAdjust
 *
 * Full name:        System`ImageAdjust
 *
 *                   ImageAdjust[image] adjusts the levels in image, rescaling them to cover the range 0 to 1.
 *                   ImageAdjust[image, corr] adjusts the image according to the correction specification corr.
 *                   ImageAdjust[image, corr, {in   , in   }] first rescales so that the range of input values in    to in    is mapped to 0 to 1.
 *                                               min    max                                                      min      max
 *                   ImageAdjust[image, corr, {in   , in   }, {out   , out   }] rescales so that the range of input values in    to in    is mapped to out    to out   .
 * Usage:                                        min    max       min     max                                                min      max                 min       max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageAdjust
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageAdjust.html
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
fun imageAdjust(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageAdjust", arguments.toMutableList(), options)
}
