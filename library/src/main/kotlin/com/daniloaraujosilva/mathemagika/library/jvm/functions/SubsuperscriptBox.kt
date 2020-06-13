package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SubsuperscriptBox
 *
 * Full name:        System`SubsuperscriptBox
 *
 *                                                                                       z
 *                   SubsuperscriptBox[x, y, z] is the low‐level box representation for x  in notebook expressions.
 * Usage:                                                                                y
 *
 * Options:          MultilineFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsuperscriptBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsuperscriptBox.html
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
fun subsuperscriptBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsuperscriptBox", arguments.toMutableList(), options)
}
