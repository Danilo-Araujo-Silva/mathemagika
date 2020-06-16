package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KeyCollisionFunction
 *
 * Full name:        System`KeyCollisionFunction
 *
 * Usage:            KeyCollisionFunction is an option for JoinAcross that specifies how to handle pairs of elements that are not being joined but nevertheless have the same key.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyCollisionFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyCollisionFunction.html
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
fun keyCollisionFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyCollisionFunction", arguments.toMutableList(), options)
}
