package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MaxRecursion
 *
 * Full name:        System`MaxRecursion
 *
 * Usage:            MaxRecursion is an option for functions like NIntegrate and Plot that specifies how many recursive subdivisions can be made.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxRecursion
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxRecursion.html
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
fun maxRecursion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxRecursion", arguments.toMutableList(), options)
}
