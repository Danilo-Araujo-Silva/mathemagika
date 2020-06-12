package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MorphologicalBranchPoints
 *
 * Full name:        System`MorphologicalBranchPoints
 *
 * Usage:            MorphologicalBranchPoints[image] gives a version of a binary image image in which white pixels represent the morphological branch points.
 *
 * Options:          Padding -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MorphologicalBranchPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/MorphologicalBranchPoints.html
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
fun morphologicalBranchPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MorphologicalBranchPoints", arguments.toMutableList(), options)
}
