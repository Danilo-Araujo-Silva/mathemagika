package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RulerUnits
 *
 * Full name:        System`RulerUnits
 *
 * Usage:            RulerUnits is an option for notebooks that specifies the units in the ruler toolbar.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RulerUnits
 * Documentation:    web: http://reference.wolfram.com/language/ref/RulerUnits.html
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
fun rulerUnits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RulerUnits", arguments.toMutableList(), options)
}
