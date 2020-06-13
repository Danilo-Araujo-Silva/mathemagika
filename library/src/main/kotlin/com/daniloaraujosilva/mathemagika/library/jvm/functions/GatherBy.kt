package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GatherBy
 *
 * Full name:        System`GatherBy
 *
 *                   GatherBy[list, f] gathers into sublists each set of elements in list that gives the same value when f is applied.
 *                   GatherBy[list, {f , f , …}] gathers list into nested sublists using f  at level i.
 * Usage:                             1   2                                               i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GatherBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/GatherBy.html
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
fun gatherBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GatherBy", arguments.toMutableList(), options)
}
