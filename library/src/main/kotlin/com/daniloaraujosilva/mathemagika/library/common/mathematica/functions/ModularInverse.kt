package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ModularInverse
 *
 * Full name:        System`ModularInverse
 *
 * Usage:            ModularInverse[k, n] gives the modular inverse of k modulo n.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ModularInverse
 * Documentation:    web: http://reference.wolfram.com/language/ref/ModularInverse.html
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
fun modularInverse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ModularInverse", arguments.toMutableList(), options)
}
