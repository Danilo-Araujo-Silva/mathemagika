package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TakeDrop
 *
 * Full name:        System`TakeDrop
 *
 *                   TakeDrop[list, n] gives the pair {list , list }, where list  contains the first n elements of list and list  contains the rest.
 *                                                         1      2             1                                               2
 * Usage:            TakeDrop[list, seq] gives the pair {Take[list, seq], Drop[list, seq]}.
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TakeDrop
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeDrop.html
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
fun takeDrop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeDrop", arguments.toMutableList(), options)
}
