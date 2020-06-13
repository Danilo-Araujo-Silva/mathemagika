package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Inactivate
 *
 * Full name:        System`Inactivate
 *
 *                   Inactivate[expr] replaces all instances of f with Inactive[f] for symbols f used as heads in expr.
 * Usage:            Inactivate[expr, patt] inactivates all symbols in expr that match the pattern patt.
 *
 * Options:          Heads -> True
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Inactivate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Inactivate.html
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
fun inactivate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Inactivate", arguments.toMutableList(), options)
}
