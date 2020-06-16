package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindIntegerNullVector
 *
 * Full name:        System`FindIntegerNullVector
 *
 *                   FindIntegerNullVector[{x , x , …, x }] finds a list of integers a  such that a  x  + a  x  + ⋯ + a  x   0.
 *                                           1   2      n                             i            1  1    2  2        n  n
 *                   FindIntegerNullVector[{x , x , …, x }, d] finds a list of integers a  with  {a , …, a }  ≤ d such that a  x  + a  x  + ⋯ + a  x   0.
 * Usage:                                    1   2      n                                i          1      n                   1  1    2  2        n  n
 *
 *                   WorkingPrecision -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindIntegerNullVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindIntegerNullVector.html
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
fun findIntegerNullVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindIntegerNullVector", arguments.toMutableList(), options)
}
