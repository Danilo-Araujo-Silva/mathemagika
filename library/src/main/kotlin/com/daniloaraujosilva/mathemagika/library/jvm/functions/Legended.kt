package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Legended
 *
 * Full name:        System`Legended
 *
 *                   Legended[expr, leg] displays expr with legend leg.
 * Usage:            Legended[expr, lbl] indicates in plotting and charting functions that a legend entry for expr should be created, with label lbl.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Legended
 * Documentation:    web: http://reference.wolfram.com/language/ref/Legended.html
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
fun legended(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Legended", arguments.toMutableList(), options)
}
