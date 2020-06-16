package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UnderscriptBox
 *
 * Full name:        System`UnderscriptBox
 *
 *                   UnderscriptBox[x, y] is the low‐level box representation for x in notebook expressions.
 * Usage:                                                                         y
 *
 * Options:          LimitsPositioning -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnderscriptBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnderscriptBox.html
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
fun underscriptBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnderscriptBox", arguments.toMutableList(), options)
}
