package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DoublyInfinite
 *
 * Full name:        System`DoublyInfinite
 *
 * Usage:            DoublyInfinite is an option for LerchPhi. With DoublyInfinite -> True, the summation is taken from -Infinity to Infinity. With DoublyInfinite -> False, the summation is taken from zero to Infinity.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun doublyInfinite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoublyInfinite", arguments.toMutableList(), options)
}
