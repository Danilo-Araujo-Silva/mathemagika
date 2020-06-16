package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Jacobian
 *
 * Full name:        System`Jacobian
 *
 * Usage:            Jacobian is an option for FindRoot. Jacobian -> Automatic attempts symbolic computation of the Jacobian of the system of functions whose root is being sought. A typical setting is Jacobian -> {{2 x, Sign[y]}, {y, x}}.
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
fun jacobian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Jacobian", arguments.toMutableList(), options)
}
