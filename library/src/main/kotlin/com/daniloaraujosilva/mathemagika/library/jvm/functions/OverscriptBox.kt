package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OverscriptBox
 *
 * Full name:        System`OverscriptBox
 *
 *                                                                               y
 * Usage:            OverscriptBox[x, y] is the low‐level box representation for x in notebook expressions.
 *
 * Options:          LimitsPositioning -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OverscriptBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverscriptBox.html
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
fun overscriptBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverscriptBox", arguments.toMutableList(), options)
}
