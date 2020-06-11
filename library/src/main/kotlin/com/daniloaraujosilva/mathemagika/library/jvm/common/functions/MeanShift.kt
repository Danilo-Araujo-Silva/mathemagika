package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanShift
 *
 * Full name:        System`MeanShift
 *
 *                   MeanShift[list, d] replaces each element in list by the mean of the values of all elements that differ by less than d.
 *                   MeanShift[list, d, {p , p , …}] returns the list where only the specified parts p  are replaced with mean-shifted values.
 *                                        1   2                                                       i
 * Usage:            MeanShift[image, …] mean shift of the pixel values in image.
 *
 *                   DistanceFunction -> EuclideanDistance
 *                   MaxIterations -> 1
 *                   Tolerance -> 0
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeanShift
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanShift.html
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
fun meanShift(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanShift", arguments.toMutableList(), options)
}
