package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RudinShapiro
 *
 * Full name:        System`RudinShapiro
 *
 *                                               th
 * Usage:            RudinShapiro[n] gives the n   term in the Rudin–Shapiro sequence.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RudinShapiro
 * Documentation:    web: http://reference.wolfram.com/language/ref/RudinShapiro.html
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
fun rudinShapiro(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RudinShapiro", arguments.toMutableList(), options)
}
