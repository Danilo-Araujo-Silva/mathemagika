package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HeldPart
 *
 * Full name:        System`HeldPart
 *
 * Usage:            System`HeldPart
 *
 * Options:          None
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HeldPart
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeldPart.html
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
fun heldPart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeldPart", arguments.toMutableList(), options)
}
