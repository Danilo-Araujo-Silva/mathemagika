package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ColorData
 *
 * Full name:        System`ColorData
 *
 *                   ColorData["scheme"] gives a function that generates colors in the named color scheme when applied to parameter values.
 *                   ColorData["scheme", "property"] gives the specified property of a color scheme.
 *                   ColorData["collection"] gives a list of color schemes in a named collection.
 * Usage:            ColorData[] gives a list of named collections of color schemes.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorData.html
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
fun colorData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorData", arguments.toMutableList(), options)
}
