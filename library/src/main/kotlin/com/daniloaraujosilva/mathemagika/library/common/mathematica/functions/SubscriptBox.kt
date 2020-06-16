package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubscriptBox
 *
 * Full name:        System`SubscriptBox
 *
 *                   SubscriptBox[x, y] is the low‐level box representation for x  in notebook expressions.
 * Usage:                                                                        y
 *
 * Options:          MultilineFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubscriptBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubscriptBox.html
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
fun subscriptBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubscriptBox", arguments.toMutableList(), options)
}
