package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MorphologicalEulerNumber
 *
 * Full name:        System`MorphologicalEulerNumber
 *
 *                   MorphologicalEulerNumber[image] computes the morphological Euler number of regions in a binary image.
 * Usage:            MorphologicalEulerNumber[image, t] treats values above t as foreground.
 *
 *                   CornerNeighbors -> True
 * Options:          Padding -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MorphologicalEulerNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/MorphologicalEulerNumber.html
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
fun morphologicalEulerNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MorphologicalEulerNumber", arguments.toMutableList(), options)
}
