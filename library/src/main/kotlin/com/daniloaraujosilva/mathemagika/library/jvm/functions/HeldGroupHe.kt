package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HeldGroupHe
 *
 * Full name:        System`HeldGroupHe
 *
 * Usage:            HeldGroupHe[] represents the sporadic simple Held group He.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeldGroupHe
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeldGroupHe.html
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
fun heldGroupHe(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeldGroupHe", arguments.toMutableList(), options)
}
