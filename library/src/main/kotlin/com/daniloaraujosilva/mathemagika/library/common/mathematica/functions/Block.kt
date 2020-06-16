package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Block
 *
 * Full name:        System`Block
 *
 *                   Block[{x, y, …}, expr] specifies that expr is to be evaluated with local values for the symbols x, y, ….
 *                   Block[{x = x , …}, expr] defines initial local values for x, ….
 * Usage:                        0
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Block
 * Documentation:    web: http://reference.wolfram.com/language/ref/Block.html
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
fun block(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Block", arguments.toMutableList(), options)
}
