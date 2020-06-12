package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnderoverscriptBox
 *
 * Full name:        System`UnderoverscriptBox
 *
 *                                                                                       z
 *                   UnderoverscriptBox[x, y, z] is the low‐level box representation for x in notebook expressions.
 * Usage:                                                                                y
 *
 * Options:          LimitsPositioning -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnderoverscriptBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnderoverscriptBox.html
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
fun underoverscriptBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnderoverscriptBox", arguments.toMutableList(), options)
}
