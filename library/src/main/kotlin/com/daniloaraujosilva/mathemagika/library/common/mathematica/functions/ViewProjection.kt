package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ViewProjection
 *
 * Full name:        System`ViewProjection
 *
 * Usage:            ViewProjection is an option for three-dimensional graphics that specifies the projection to use for the graphic.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ViewProjection
 * Documentation:    web: http://reference.wolfram.com/language/ref/ViewProjection.html
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
fun viewProjection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ViewProjection", arguments.toMutableList(), options)
}
