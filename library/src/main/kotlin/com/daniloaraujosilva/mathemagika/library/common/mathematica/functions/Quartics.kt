package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Quartics
 *
 * Full name:        System`Quartics
 *
 * Usage:            Quartics is an option for functions that involve solving algebraic equations that specifies whether explicit forms for solutions to quartic equations should be given.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Quartics
 * Documentation:    web: http://reference.wolfram.com/language/ref/Quartics.html
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
fun quartics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Quartics", arguments.toMutableList(), options)
}
