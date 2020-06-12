package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringDrop
 *
 * Full name:        System`StringDrop
 *
 *                   StringDrop["string", n] gives "string" with its first n characters dropped.
 *                   StringDrop["string", -n] gives "string" with its last n characters dropped.
 *                                                                       th
 *                   StringDrop["string", {n}] gives "string" with its n   character dropped.
 *                   StringDrop["string", {m, n}] gives "string" with characters m through n dropped.
 *                   StringDrop[{s , s , …}, spec] gives the list of results for each of the s .
 * Usage:                         1   2                                                       i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringDrop
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringDrop.html
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
fun stringDrop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringDrop", arguments.toMutableList(), options)
}
