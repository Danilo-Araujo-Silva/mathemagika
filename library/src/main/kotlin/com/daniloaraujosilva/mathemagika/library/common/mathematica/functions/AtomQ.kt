package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AtomQ
 *
 * Full name:        System`AtomQ
 *
 * Usage:            AtomQ[expr] yields True if expr is an expression which cannot be divided into subexpressions, and yields False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AtomQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AtomQ.html
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
fun atomQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AtomQ", arguments.toMutableList(), options)
}
