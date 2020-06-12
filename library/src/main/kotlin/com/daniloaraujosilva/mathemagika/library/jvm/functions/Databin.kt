package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Databin
 *
 * Full name:        System`Databin
 *
 *                   Databin["id"] represents a databin in the Wolfram Data Drop.
 *                   Databin["id", n] represents the first n entries in a databin.
 *                   Databin["id", -n] represents the most recent n entries in a databin.
 *                   Databin["id", {m, n}] represents entries m through n in a databin, with negative numbers counting from the end.
 *                   Databin["id", {m, n, s}] represents entries m through n with step s.
 *                   Databin["id", time] represents entries going back for the quantity of time specified by time.
 *                   Databin["id", date] represents the entries in a databin from the specified date to now.
 *                   Databin["id", {date , date }] represents the entries in a databin from date  to date .
 *                                      1      2                                                1        2
 *                   Databin["id", range, {key , key , …}] represents only elements with keys key  within each entry in a databin.
 * Usage:                                     1     2                                            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Databin
 * Documentation:    web: http://reference.wolfram.com/language/ref/Databin.html
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
fun databin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Databin", arguments.toMutableList(), options)
}
