package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LabelVisibility
 *
 * Full name:        System`LabelVisibility
 *
 * Usage:            LabelVisibility is an option for Callout and Labeled in plotting functions that determines which labels are shown.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LabelVisibility
 * Documentation:    web: http://reference.wolfram.com/language/ref/LabelVisibility.html
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
fun labelVisibility(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LabelVisibility", arguments.toMutableList(), options)
}
