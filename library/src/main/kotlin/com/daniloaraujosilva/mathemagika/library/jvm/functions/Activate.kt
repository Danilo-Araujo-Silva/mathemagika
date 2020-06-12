package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Activate
 *
 * Full name:        System`Activate
 *
 *                   Activate[expr] replaces all instances of Inactive[f] in expr with f.
 * Usage:            Activate[expr, patt] replaces only instances of Inactive[f] for which f matches the pattern patt.
 *
 * Options:          Heads -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Activate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Activate.html
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
fun activate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Activate", arguments.toMutableList(), options)
}
