package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KeyDrop
 *
 * Full name:        System`KeyDrop
 *
 *                   KeyDrop[assoc, {key , key , …}] yields an association from which elements with keys key  have been dropped.
 *                                      1     2                                                             i
 *                   KeyDrop[{assoc , assoc , …}, keys] gives a list of associations.
 *                                 1       2
 * Usage:            KeyDrop[keys] represents an operator form of KeyDrop that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyDrop
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyDrop.html
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
fun keyDrop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyDrop", arguments.toMutableList(), options)
}
