package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanConvert
 *
 * Full name:        System`BooleanConvert
 *
 *                   BooleanConvert[expr] converts the Boolean expression expr to disjunctive normal form.
 *                   BooleanConvert[expr, form] converts the Boolean expression expr to the specified form.
 * Usage:            BooleanConvert[expr, form, cond] finds an expression in the specified form that is equivalent to expr when cond is true.
 *
 * Options:          Method -> Automatic
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanConvert.html
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
fun booleanConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanConvert", arguments.toMutableList(), options)
}
