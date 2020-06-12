package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanMinterms
 *
 * Full name:        System`BooleanMinterms
 *
 *                                                          th
 *                   BooleanMinterms[k, n] represents the k   minterm in n variables.
 *                   BooleanMinterms[{k , k , …}, n] represents the disjunction of the minterms k .
 *                                     1   2                                                     i
 *                   BooleanMinterms[{{u , …, u }, {v , …}, …}] represents the disjunction of minterms given by the exponent vectors u , v , ….
 *                                      1      n     1                                                                                i   i
 *                   BooleanMinterms[spec, {a , a , …}] gives the Boolean expression in variables a  corresponding to the minterms function specified by spec.
 *                                           1   2                                                 i
 *                   BooleanMinterms[spec, {a, a , …}, form] gives the Boolean expression in the form specified by form.
 * Usage:                                       2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanMinterms
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanMinterms.html
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
fun booleanMinterms(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanMinterms", arguments.toMutableList(), options)
}
