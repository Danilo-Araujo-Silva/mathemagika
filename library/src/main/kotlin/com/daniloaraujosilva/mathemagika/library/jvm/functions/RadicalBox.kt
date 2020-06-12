package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RadicalBox
 *
 * Full name:        System`RadicalBox
 *
 *                                                                                                       1/n
 * Usage:            RadicalBox[x, n] is a low-level box construct that represents the displayed object x    in notebook expressions.
 *
 *                   MinSize -> Automatic
 * Options:          MultilineFunction -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RadicalBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadicalBox.html
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
fun radicalBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadicalBox", arguments.toMutableList(), options)
}
