package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContainsExactly
 *
 * Full name:        System`ContainsExactly
 *
 *                   ContainsExactly[e , e ] yields True if e  contains exactly the same elements as e .
 *                                    1   2                  1                                        2
 *                   ContainsExactly[e ] is an operator form that yields True when the object to which it is applied contains exactly the same elements as e .
 * Usage:                             2                                                                                                                     2
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContainsExactly
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContainsExactly.html
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
fun containsExactly(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContainsExactly", arguments.toMutableList(), options)
}
