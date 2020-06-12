package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Modulus
 *
 * Full name:        System`Modulus
 *
 * Usage:            Modulus  n is an option that can be given in certain algebraic functions to specify that integers should be treated modulo n.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Modulus
 * Documentation:    web: http://reference.wolfram.com/language/ref/Modulus.html
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
fun modulus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Modulus", arguments.toMutableList(), options)
}
