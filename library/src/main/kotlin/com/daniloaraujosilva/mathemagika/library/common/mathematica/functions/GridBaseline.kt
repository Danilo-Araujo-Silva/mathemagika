package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GridBaseline
 *
 * Full name:        System`GridBaseline
 *
 * Usage:            GridBaseline is an option for GridBox that specifies what place in the grid should be considered its baseline for purposes of alignment with surrounding objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GridBaseline
 * Documentation:    web: http://reference.wolfram.com/language/ref/GridBaseline.html
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
fun gridBaseline(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GridBaseline", arguments.toMutableList(), options)
}
