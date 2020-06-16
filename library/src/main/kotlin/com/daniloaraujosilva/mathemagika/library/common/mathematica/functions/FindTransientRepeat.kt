package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindTransientRepeat
 *
 * Full name:        System`FindTransientRepeat
 *
 *                   FindTransientRepeat[list, n] returns a pair of lists {transient, repeat} where the elements of repeat occur successively at least n times after the elements of the transient part of list.
 * Usage:            FindTransientRepeat[string, n] returns a pair of strings {transient, repeat}.
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindTransientRepeat
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindTransientRepeat.html
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
fun findTransientRepeat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindTransientRepeat", arguments.toMutableList(), options)
}
