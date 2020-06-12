package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteCurrentValue
 *
 * Full name:        System`AbsoluteCurrentValue
 *
 *                   AbsoluteCurrentValue[item] gives the absolute current value of item at a location in the Wolfram System and interface.
 *                   AbsoluteCurrentValue[{item, spec}] gives the absolute current value for the feature of item specified by spec.
 * Usage:            AbsoluteCurrentValue[obj, item] gives the absolute current value of item associated with the object obj.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbsoluteCurrentValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteCurrentValue.html
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
fun absoluteCurrentValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteCurrentValue", arguments.toMutableList(), options)
}
