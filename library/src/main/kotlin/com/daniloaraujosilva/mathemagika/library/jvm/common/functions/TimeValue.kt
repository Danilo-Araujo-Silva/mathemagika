package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeValue
 *
 * Full name:        System`TimeValue
 *
 * Usage:            TimeValue[s, i, t] calculates the time value of a security s at time t for an interest specified by i.
 *
 *                   Assumptions :> $Assumptions
 *                   ClosedForm -> True
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeValue.html
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
fun timeValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeValue", arguments.toMutableList(), options)
}
