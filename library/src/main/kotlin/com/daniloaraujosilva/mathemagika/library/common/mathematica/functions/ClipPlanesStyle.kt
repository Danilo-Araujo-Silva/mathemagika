package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ClipPlanesStyle
 *
 * Full name:        System`ClipPlanesStyle
 *
 * Usage:            ClipPlanesStyle is an option to Graphics3D that specifies how clipping planes defined with the ClipPlanes option should be rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClipPlanesStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClipPlanesStyle.html
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
fun clipPlanesStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClipPlanesStyle", arguments.toMutableList(), options)
}
