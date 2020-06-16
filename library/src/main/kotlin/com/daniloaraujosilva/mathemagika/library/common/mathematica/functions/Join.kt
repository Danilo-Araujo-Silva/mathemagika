package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Join
 *
 * Full name:        System`Join
 *
 *                   Join[list , list , …] concatenates lists or other expressions that share the same head.
 *                            1      2
 *                   Join[list , list , …, n] joins the objects at level n in each of the list .
 * Usage:                     1      2                                                        i
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Join
 * Documentation:    web: http://reference.wolfram.com/language/ref/Join.html
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
fun join(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Join", arguments.toMutableList(), options)
}
