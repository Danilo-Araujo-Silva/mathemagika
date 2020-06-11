package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MorphologicalBinarize
 *
 * Full name:        System`MorphologicalBinarize
 *
 *                   MorphologicalBinarize[image, {t , t }] creates a binary image from image by replacing all values above the upper threshold t  with 1, also including pixels with intensities above the lower threshold t  that are connected to the foreground.
 *                                                  1   2                                                                                        2                                                                           1
 *                   MorphologicalBinarize[image, t] uses t as the upper threshold, automatically choosing a suitable value for the lower threshold.
 * Usage:            MorphologicalBinarize[image] chooses the lower and the upper threshold automatically.
 *
 *                   CornerNeighbors -> True
 * Options:          Method -> Cluster
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MorphologicalBinarize
 * Documentation:    web: http://reference.wolfram.com/language/ref/MorphologicalBinarize.html
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
fun morphologicalBinarize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MorphologicalBinarize", arguments.toMutableList(), options)
}
