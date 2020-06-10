package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GroupBy
 * 
 * Full name:        System`GroupBy
 * 
 *                   GroupBy[{elem , elem , …}, f] gives an association that groups the elem  into lists associated with distinct keys f[elem ].
 *                                1      2                                                  i                                                i
 *                   GroupBy[{elem , elem , …}, f   f ] groups the f [elem ] according to the f [elem ].
 *                                1      2       k    v              v     i                    k     i
 *                   GroupBy[{elem , elem , …}, {fs , fs , …}] groups into nested associations using fs  at level i.
 *                                1      2         1    2                                              i
 *                   GroupBy[{elem , elem , …}, spec, red] applies the function red to reduce lists of values that are generated.
 *                                1      2
 * Usage:            GroupBy[spec] represents an operator form of GroupBy that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/GroupBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupBy.html
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
fun groupBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupBy", arguments.toMutableList(), options)
}
