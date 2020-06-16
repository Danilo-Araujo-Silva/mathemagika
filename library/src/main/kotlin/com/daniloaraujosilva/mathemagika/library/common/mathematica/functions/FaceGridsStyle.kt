package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FaceGridsStyle
 *
 * Full name:        System`FaceGridsStyle
 *
 * Usage:            FaceGridsStyle is an option for 3D graphics functions that specifies how face grids should be rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FaceGridsStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FaceGridsStyle.html
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
fun faceGridsStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FaceGridsStyle", arguments.toMutableList(), options)
}
