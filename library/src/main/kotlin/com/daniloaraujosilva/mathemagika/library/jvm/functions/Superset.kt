package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Superset
 *
 * Full name:        System`Superset
 *
 * Usage:            Superset[x, y, …] displays as x ⊃ y ⊃ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Superset
 * Documentation:    web: http://reference.wolfram.com/language/ref/Superset.html
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
fun superset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Superset", arguments.toMutableList(), options)
}
