package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FactorComplete
 *
 * Full name:        System`FactorComplete
 *
 * Usage:            System`FactorComplete
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorComplete
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorComplete.html
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
fun factorComplete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorComplete", arguments.toMutableList(), options)
}
