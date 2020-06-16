package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InputAssumptions
 *
 * Full name:        System`InputAssumptions
 *
 * Usage:            InputAssumptions is an option for WolframAlpha that specifies assumptions for current query input.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InputAssumptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputAssumptions.html
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
fun inputAssumptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputAssumptions", arguments.toMutableList(), options)
}
