package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanCountingFunction
 *
 * Full name:        System`BooleanCountingFunction
 *
 *                   BooleanCountingFunction[k   , n] represents a Boolean function of n variables that gives True if at most k    variables are True.
 *                                            max                                                                              max
 *                   BooleanCountingFunction[{k}, n] represents a function of n variables that gives True if exactly k variables are True.
 *                   BooleanCountingFunction[{k   , k   }, n] represents a function that gives True if between k    and k    variables are True.
 *                                             min   max                                                        min      max
 *                   BooleanCountingFunction[{{k , k , …}}, n] represents a function that gives True if exactly k  variables are True.
 *                                              1   2                                                            i
 *                   BooleanCountingFunction[spec, {a , a , …}] gives the Boolean expression in variables a  corresponding to the Boolean counting function specified by spec.
 *                                                   1   2                                                 i
 *                   BooleanCountingFunction[spec, {a , a , …}, form] gives the Boolean expression in the form specified by form.
 * Usage:                                            1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanCountingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanCountingFunction.html
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
fun booleanCountingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanCountingFunction", arguments.toMutableList(), options)
}
