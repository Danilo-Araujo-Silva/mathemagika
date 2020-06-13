package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AbsArg
 *
 * Full name:        System`AbsArg
 *
 * Usage:            AbsArg[z] gives the list {Abs[z], Arg[z]} of the number z.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AbsArg
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsArg.html
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
fun absArg(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsArg", arguments.toMutableList(), options)
}
