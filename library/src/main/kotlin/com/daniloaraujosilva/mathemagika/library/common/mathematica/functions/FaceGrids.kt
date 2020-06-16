package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FaceGrids
 *
 * Full name:        System`FaceGrids
 *
 * Usage:            FaceGrids is an option for three-dimensional graphics functions that specifies grid lines to draw on the faces of the bounding box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FaceGrids
 * Documentation:    web: http://reference.wolfram.com/language/ref/FaceGrids.html
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
fun faceGrids(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FaceGrids", arguments.toMutableList(), options)
}
