package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cubics
 *
 * Full name:        System`Cubics
 *
 * Usage:            Cubics is an option for functions that involve solving algebraic equations, that specifies whether explicit forms for solutions to cubic equations should be given.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Cubics
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cubics.html
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
fun cubics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cubics", arguments.toMutableList(), options)
}
