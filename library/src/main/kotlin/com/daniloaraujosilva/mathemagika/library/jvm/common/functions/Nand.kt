package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Nand
 *
 * Full name:        System`Nand
 *
 *                   Nand[e , e , …] is the logical NAND function. It evaluates its arguments in order, giving True immediately if any of them are False, and False if they are all True.
 * Usage:                  1   2
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Nand
 * Documentation:    web: http://reference.wolfram.com/language/ref/Nand.html
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
fun nand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Nand", arguments.toMutableList(), options)
}
