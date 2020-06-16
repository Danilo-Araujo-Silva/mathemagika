package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Mod
 *
 * Full name:        System`Mod
 *
 *                   Mod[m, n] gives the remainder on division of m by n.
 * Usage:            Mod[m, n, d] uses an offset d.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Mod
 * Documentation:    web: http://reference.wolfram.com/language/ref/Mod.html
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
fun mod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Mod", arguments.toMutableList(), options)
}
