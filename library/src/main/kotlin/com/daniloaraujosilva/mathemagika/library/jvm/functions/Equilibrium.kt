package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Equilibrium
 *
 * Full name:        System`Equilibrium
 *
 * Usage:            Equilibrium[x, y, …] displays as x ⇌ y ⇌ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Equilibrium
 * Documentation:    web: http://reference.wolfram.com/language/ref/Equilibrium.html
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
fun equilibrium(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Equilibrium", arguments.toMutableList(), options)
}
