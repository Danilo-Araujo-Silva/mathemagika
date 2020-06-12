package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeyDropFrom
 *
 * Full name:        System`KeyDropFrom
 *
 *                   KeyDropFrom[a, key] changes the association a by dropping the element with the specified key.
 *                   KeyDropFrom[a, {key , key , …}] drops the elements with keys key .
 * Usage:                               1     2                                      i
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyDropFrom
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyDropFrom.html
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
fun keyDropFrom(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyDropFrom", arguments.toMutableList(), options)
}
