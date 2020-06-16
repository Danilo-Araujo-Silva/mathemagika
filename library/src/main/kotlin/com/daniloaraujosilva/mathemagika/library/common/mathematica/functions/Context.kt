package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Context
 *
 * Full name:        System`Context
 *
 *                   Context[] gives the current context.
 * Usage:            Context[symbol] gives the context in which a symbol appears.
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Context
 * Documentation:    web: http://reference.wolfram.com/language/ref/Context.html
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
fun context(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Context", arguments.toMutableList(), options)
}
