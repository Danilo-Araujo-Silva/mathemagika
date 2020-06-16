package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KnotData
 *
 * Full name:        System`KnotData
 *
 *                   KnotData[knot, "property"] gives the specified property for a knot.
 *                   KnotData[knot] gives an image of the knot.
 * Usage:            KnotData["class"] gives a list of knots in the specified class.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KnotData
 * Documentation:    web: http://reference.wolfram.com/language/ref/KnotData.html
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
fun knotData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KnotData", arguments.toMutableList(), options)
}
