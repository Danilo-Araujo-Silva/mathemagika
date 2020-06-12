package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HodgeDual
 *
 * Full name:        System`HodgeDual
 *
 *                   HodgeDual[tensor] gives the Hodge dual of the tensor
 *                   HodgeDual[tensor, dim] dualizes tensor in the slots with dimension dim
 * Usage:            HodgeDual[tensor, dim, slots] dualizes tensor in the given slots.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HodgeDual
 * Documentation:    web: http://reference.wolfram.com/language/ref/HodgeDual.html
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
fun hodgeDual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HodgeDual", arguments.toMutableList(), options)
}
