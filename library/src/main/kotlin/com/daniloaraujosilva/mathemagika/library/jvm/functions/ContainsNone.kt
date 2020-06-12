package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContainsNone
 *
 * Full name:        System`ContainsNone
 *
 *                   ContainsNone[e , e ] yields True if e  contains none of the elements in e .
 *                                 1   2                  1                                   2
 *                   ContainsNone[e ] is an operator form that yields True when the object to which it is applied contains none of the elements of e .
 * Usage:                          2                                                                                                                2
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContainsNone
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContainsNone.html
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
fun containsNone(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContainsNone", arguments.toMutableList(), options)
}
