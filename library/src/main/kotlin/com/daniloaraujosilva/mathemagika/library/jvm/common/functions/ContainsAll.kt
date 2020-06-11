package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContainsAll
 *
 * Full name:        System`ContainsAll
 *
 *                   ContainsAll[e , e ] yields True if e  contains all of the elements of e .
 *                                1   2                  1                                  2
 *                   ContainsAll[e ] is an operator form that yields True when the object to which it is applied contains all of the elements of e .
 * Usage:                         2                                                                                                               2
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContainsAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContainsAll.html
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
fun containsAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContainsAll", arguments.toMutableList(), options)
}
