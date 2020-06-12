package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SuperscriptBox
 *
 * Full name:        System`SuperscriptBox
 *
 *                                                                                 y
 * Usage:            SuperscriptBox[x, y] is the low‐level box representation for x  in notebook expressions.
 *
 * Options:          MultilineFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SuperscriptBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuperscriptBox.html
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
fun superscriptBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuperscriptBox", arguments.toMutableList(), options)
}
