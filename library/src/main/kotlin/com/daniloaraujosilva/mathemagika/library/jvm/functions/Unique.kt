package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Unique
 *
 * Full name:        System`Unique
 *
 *                   Unique[] generates a new symbol, whose name is of the form $nnn.
 *                   Unique[x] generates a new symbol, with a name of the form x$nnn.
 *                   Unique[{x, y, …}] generates a list of new symbols.
 * Usage:            Unique["xxx"] generates a new symbol, with a name of the form xxxnnn.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Unique
 * Documentation:    web: http://reference.wolfram.com/language/ref/Unique.html
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
fun unique(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Unique", arguments.toMutableList(), options)
}
