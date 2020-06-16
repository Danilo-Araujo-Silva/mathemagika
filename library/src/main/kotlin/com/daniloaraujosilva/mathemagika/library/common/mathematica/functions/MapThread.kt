package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MapThread
 *
 * Full name:        System`MapThread
 *
 *                   MapThread[f, {{a , a , …}, {b , b , …}, …}] gives {f[a , b , …], f[a , b , …], …}.
 *                                   1   2        1   2                    1   1         2   2
 *                   MapThread[f, {expr , expr , …}, n] applies f to the parts of the expr  at level n.
 *                                     1      2                                           i
 * Usage:            MapThread[f] represents an operator form of MapThread that can be applied to an expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MapThread
 * Documentation:    web: http://reference.wolfram.com/language/ref/MapThread.html
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
fun mapThread(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MapThread", arguments.toMutableList(), options)
}
