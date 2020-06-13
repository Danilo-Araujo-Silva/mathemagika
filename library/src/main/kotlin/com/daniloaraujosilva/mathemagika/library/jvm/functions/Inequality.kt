package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Inequality
 *
 * Full name:        System`Inequality
 *
 * Usage:            Inequality represents a sequence of relational statements.
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
fun inequality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Inequality", arguments.toMutableList(), options)
}
