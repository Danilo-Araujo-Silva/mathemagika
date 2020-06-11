package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContainsAny
 *
 * Full name:        System`ContainsAny
 *
 *                   ContainsAny[e , e ] yields True if e  contains any of the elements of e .
 *                                1   2                  1                                  2
 *                   ContainsAny[e ] is an operator form that yields True when the object to which it is applied contains any of the elements in e .
 * Usage:                         2                                                                                                               2
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContainsAny
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContainsAny.html
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
fun containsAny(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContainsAny", arguments.toMutableList(), options)
}
