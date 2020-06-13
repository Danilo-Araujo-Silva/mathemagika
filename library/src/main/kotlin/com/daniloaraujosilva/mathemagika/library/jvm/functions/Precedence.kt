package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Precedence
 *
 * Full name:        System`Precedence
 *
 *                   Precedence[sym] returns the precedence of the output operator associated to the symbol sym.
 * Usage:            Precedence[boxes, fmt] returns the precedence of the operator of used in the typeset expression boxes, assuming it was typeset in the format fmt.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun precedence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Precedence", arguments.toMutableList(), options)
}
