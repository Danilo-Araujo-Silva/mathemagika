package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Condition
 *
 * Full name:        System`Condition
 *
 *                   patt/;test is a pattern which matches only if the evaluation of test yields True.
 *                   lhs :> rhs/;test represents a rule which applies only if the evaluation of test yields True.
 * Usage:            lhs := rhs/;test is a definition to be used only if test yields True.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Condition
 * Documentation:    web: http://reference.wolfram.com/language/ref/Condition.html
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
fun condition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Condition", arguments.toMutableList(), options)
}
