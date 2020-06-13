package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LUBackSubstitution
 *
 * Full name:        System`LUBackSubstitution
 *
 * Usage:            System`LUBackSubstitution
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LUBackSubstitution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LUBackSubstitution.html
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
fun lUBackSubstitution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LUBackSubstitution", arguments.toMutableList(), options)
}
