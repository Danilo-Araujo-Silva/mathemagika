package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Khinchin
 *
 * Full name:        System`Khinchin
 *
 * Usage:            Khinchin is Khinchin's constant, with numerical value ≃ 2.68545.
 *
 * Options:          None
 *
 *                   Constant
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Khinchin
 * Documentation:    web: http://reference.wolfram.com/language/ref/Khinchin.html
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
fun khinchin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Khinchin", arguments.toMutableList(), options)
}
