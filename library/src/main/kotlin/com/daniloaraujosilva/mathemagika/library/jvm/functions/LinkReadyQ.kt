package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinkReadyQ
 *
 * Full name:        System`LinkReadyQ
 *
 *                   LinkReadyQ[link] tests whether there is an expression ready to read from the specified WSTP connection.
 *                   LinkReadyQ[link, t] waits for up to t seconds to see if an expression becomes ready to read.
 *                   LinkReadyQ[{link , link , …}, t] tests all the link  in parallel, returning as soon as any of them are ready to read from.
 * Usage:                            1      2                           i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LinkReadyQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkReadyQ.html
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
fun linkReadyQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkReadyQ", arguments.toMutableList(), options)
}
