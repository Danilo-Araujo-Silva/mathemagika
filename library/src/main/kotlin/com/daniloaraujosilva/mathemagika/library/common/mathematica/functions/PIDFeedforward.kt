package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PIDFeedforward
 *
 * Full name:        System`PIDFeedforward
 *
 * Usage:            PIDFeedforward is an option to PIDTune that controls the reference weights used for the feedforward filter.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PIDFeedforward
 * Documentation:    web: http://reference.wolfram.com/language/ref/PIDFeedforward.html
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
fun pIDFeedforward(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PIDFeedforward", arguments.toMutableList(), options)
}
