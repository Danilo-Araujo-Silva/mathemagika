package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Arrowheads
 *
 * Full name:        System`Arrowheads
 *
 * Usage:            Arrowheads[spec] is a graphics directive specifying that arrows that follow should have arrowheads with sizes, positions, and forms specified by spec.
 *
 * Options:          Appearance -> Flat
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Arrowheads
 * Documentation:    web: http://reference.wolfram.com/language/ref/Arrowheads.html
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
fun arrowheads(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Arrowheads", arguments.toMutableList(), options)
}
