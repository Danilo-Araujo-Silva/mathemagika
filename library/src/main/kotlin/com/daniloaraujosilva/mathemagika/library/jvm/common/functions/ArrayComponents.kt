package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayComponents
 *
 * Full name:        System`ArrayComponents
 *
 *                   ArrayComponents[array] gives an array in which all identical elements of array are replaced by an integer index representing the component in which the element lies.
 *                   ArrayComponents[array, level] finds the identical elements at the specified level in array
 * Usage:            ArrayComponents[array, level, rules] uses a rule or a list of rules for specifying the labels.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArrayComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayComponents.html
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
fun arrayComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayComponents", arguments.toMutableList(), options)
}
