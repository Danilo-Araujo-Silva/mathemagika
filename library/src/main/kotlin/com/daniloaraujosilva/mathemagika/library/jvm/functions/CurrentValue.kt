package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CurrentValue
 *
 * Full name:        System`CurrentValue
 *
 *                   CurrentValue[item] gives the current value of item at a location in the Wolfram System and interface.
 *                   CurrentValue[{item, spec}] gives the current value for the feature of item specified by spec.
 * Usage:            CurrentValue[obj, item] gives the current value of item associated with the object obj.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurrentValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurrentValue.html
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
fun currentValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurrentValue", arguments.toMutableList(), options)
}
