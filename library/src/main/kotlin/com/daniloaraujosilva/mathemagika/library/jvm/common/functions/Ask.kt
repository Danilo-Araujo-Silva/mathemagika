package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Ask
 *
 * Full name:        System`Ask
 *
 *                   Ask["key"] is a construct for use inside AskFunction that gives the value associated with key, or interactively asks for it if it is not already known.
 *                   Ask["key"  formspec] uses formspec to define how input should be requested and interpreted.
 *                   Ask[{key , key , …}] gives the values associated with all the key , interactively asking for any that are needed.
 *                           1     2                                                  i
 *                   Ask[{key  -> formspec , key  -> formspec , …}] uses the formspec  to define how input for the key  should be requested and interpreted.
 * Usage:                    1            1     2            2                       i                                i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Ask
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ask.html
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
fun ask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ask", arguments.toMutableList(), options)
}
