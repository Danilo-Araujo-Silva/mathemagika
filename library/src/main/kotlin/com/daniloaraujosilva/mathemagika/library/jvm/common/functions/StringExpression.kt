package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringExpression
 *
 * Full name:        System`StringExpression
 *
 *                   s  ~~ s  ~~ … or StringExpression[s , s , …] represents a sequence of strings and symbolic string objects s .
 * Usage:             1     2                           1   2                                                                   i
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringExpression.html
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
fun stringExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringExpression", arguments.toMutableList(), options)
}
