package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Spacer
 *
 * Full name:        System`Spacer
 *
 *                   Spacer[w] displays as a spacer w printer's points wide.
 *                   Spacer[{w, h}] displays as a spacer w points wide and a total of h points high.
 * Usage:            Spacer[{w, h, dh}] makes the spacer extend dh points below the baseline.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Spacer
 * Documentation:    web: http://reference.wolfram.com/language/ref/Spacer.html
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
fun spacer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Spacer", arguments.toMutableList(), options)
}
