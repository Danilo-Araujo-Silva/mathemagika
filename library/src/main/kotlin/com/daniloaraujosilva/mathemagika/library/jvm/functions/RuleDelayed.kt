package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RuleDelayed
 *
 * Full name:        System`RuleDelayed
 *
 * Usage:            lhs :> rhs or lhs  rhs represents a rule that transforms lhs to rhs, evaluating rhs only after the rule is used.
 *
 * Options:          None
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/RuleDelayed
 * Documentation:    web: http://reference.wolfram.com/language/ref/RuleDelayed.html
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
fun ruleDelayed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RuleDelayed", arguments.toMutableList(), options)
}
