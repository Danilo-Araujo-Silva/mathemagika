package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindSequenceFunction
 *
 * Full name:        System`FindSequenceFunction
 *
 *                   FindSequenceFunction[{a , a , a , …}] attempts to find a simple function that yields the sequence a  when given successive integer arguments.
 *                                          1   2   3                                                                   n
 *                   FindSequenceFunction[{{n , a }, {n , a }, …}] attempts to find a simple function that yields a  when given argument n .
 *                                           1   1     2   2                                                       i                      i
 *                   FindSequenceFunction[ n   a , n   a , … ] gives a function that yields a  when given argument n .
 *                                           1    1   2    2                                     i                      i
 *                   FindSequenceFunction[{n   a , n   a , …}] gives a function that yields a  when given argument n .
 *                                          1    1   2    2                                    i                      i
 * Usage:            FindSequenceFunction[list, n] gives the function applied to n.
 *
 *                   FunctionSpace -> Automatic
 *                   MaxIterations -> 1
 *                   Method -> Automatic
 *                   TimeConstraint -> 10
 *                   TransformationFunctions -> Automatic
 * Options:          ValidationLength -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindSequenceFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindSequenceFunction.html
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
fun findSequenceFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindSequenceFunction", arguments.toMutableList(), options)
}
