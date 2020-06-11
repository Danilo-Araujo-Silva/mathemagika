package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeyTake
 *
 * Full name:        System`KeyTake
 *
 *                   KeyTake[assoc, {key , key , …}] yields an association containing only the elements with keys key .
 *                                      1     2                                                                      i
 *                   KeyTake[{assoc , assoc , …}, keys] gives a list of associations.
 *                                 1       2
 *                   KeyTake[{key , key , …}] represents an operator form of KeyTake that can be applied to an expression.
 * Usage:                        1     2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyTake
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyTake.html
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
fun keyTake(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyTake", arguments.toMutableList(), options)
}
