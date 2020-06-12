package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoBoundingBox
 *
 * Full name:        System`GeoBoundingBox
 *
 *                   GeoBoundingBox[g] gives the geo positions that define the bounding rectangle enclosing the geo region g.
 *                   GeoBoundingBox[g, δ] pads the region on all sides by an amount δ.
 * Usage:            GeoBoundingBox[g, Scaled[s]] pads by a fractional amount s.
 *
 * Options:          GeoModel -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoBoundingBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoBoundingBox.html
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
fun geoBoundingBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoBoundingBox", arguments.toMutableList(), options)
}
