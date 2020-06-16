package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Catalan
 *
 * Full name:        System`Catalan
 *
 * Usage:            Catalan is Catalan's constant, with numerical value ≃ 0.915966.
 *
 * Options:          None
 *
 *                   Constant
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Catalan
 * Documentation:    web: http://reference.wolfram.com/language/ref/Catalan.html
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
fun catalan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Catalan", arguments.toMutableList(), options)
}
