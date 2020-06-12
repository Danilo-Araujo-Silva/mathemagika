package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanMaxterms
 *
 * Full name:        System`BooleanMaxterms
 *
 *                                                          th
 *                   BooleanMaxterms[k, n] represents the k   maxterm in n variables.
 *                   BooleanMaxterms[{k , k , …}, n] represents the conjunction of the maxterms k .
 *                                     1   2                                                     i
 *                   BooleanMaxterms[{{u , …, u }, {v , …}, …}] represents the conjunction of maxterms given by the exponent vectors u , v , ….
 *                                      1      n     1                                                                                i   i
 *                   BooleanMaxterms[spec, {a , a , …}] gives the Boolean expression in variables a  corresponding to the maxterms function specified by spec.
 *                                           1   2                                                 i
 *                   BooleanMaxterms[spec, {a, a , …}, form] gives the Boolean expression in the form specified by form.
 * Usage:                                       2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanMaxterms
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanMaxterms.html
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
fun booleanMaxterms(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanMaxterms", arguments.toMutableList(), options)
}
