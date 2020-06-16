package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Glaisher
 *
 * Full name:        System`Glaisher
 *
 * Usage:            Glaisher is Glaisher's constant with numerical value ≃ 1.28243.
 *
 * Options:          None
 *
 *                   Constant
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Glaisher
 * Documentation:    web: http://reference.wolfram.com/language/ref/Glaisher.html
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
fun glaisher(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Glaisher", arguments.toMutableList(), options)
}
