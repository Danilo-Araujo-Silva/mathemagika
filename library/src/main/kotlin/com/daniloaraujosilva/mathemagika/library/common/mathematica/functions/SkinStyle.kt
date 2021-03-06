package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SkinStyle
 *
 * Full name:        System`SkinStyle
 *
 * Usage:            SkinStyle is an option of AnatomyPlot3D that specifies what style to use for automatically included skin subparts.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SkinStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/SkinStyle.html
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
fun skinStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SkinStyle", arguments.toMutableList(), options)
}
