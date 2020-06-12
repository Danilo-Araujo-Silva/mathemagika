package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CounterIncrements
 *
 * Full name:        System`CounterIncrements
 *
 * Usage:            CounterIncrements is an option for selections that specifies whether the value of a specified counter is incremented by one.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CounterIncrements
 * Documentation:    web: http://reference.wolfram.com/language/ref/CounterIncrements.html
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
fun counterIncrements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CounterIncrements", arguments.toMutableList(), options)
}
