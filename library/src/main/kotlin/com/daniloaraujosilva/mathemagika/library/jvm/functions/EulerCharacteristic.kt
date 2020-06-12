package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EulerCharacteristic
 *
 * Full name:        System`EulerCharacteristic
 *
 * Usage:            EulerCharacteristic[poly] gives the Euler characteristic of a poly.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EulerCharacteristic
 * Documentation:    web: http://reference.wolfram.com/language/ref/EulerCharacteristic.html
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
fun eulerCharacteristic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EulerCharacteristic", arguments.toMutableList(), options)
}
