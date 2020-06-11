package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Pick
 *
 * Full name:        System`Pick
 *
 *                   Pick[list, sel] picks out those elements of list for which the corresponding element of sel is True.
 * Usage:            Pick[list, sel, patt] picks out those elements of list for which the corresponding element of sel matches patt.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Pick
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pick.html
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
fun pick(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pick", arguments.toMutableList(), options)
}
