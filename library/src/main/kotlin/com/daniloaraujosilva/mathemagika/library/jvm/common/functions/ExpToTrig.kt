package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExpToTrig
 *
 * Full name:        System`ExpToTrig
 *
 * Usage:            ExpToTrig[expr] converts exponentials in expr to trigonometric functions.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExpToTrig
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpToTrig.html
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
fun expToTrig(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpToTrig", arguments.toMutableList(), options)
}
