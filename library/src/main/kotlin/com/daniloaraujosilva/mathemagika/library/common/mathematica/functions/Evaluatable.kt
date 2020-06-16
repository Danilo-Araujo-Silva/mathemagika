package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Evaluatable
 *
 * Full name:        System`Evaluatable
 *
 * Usage:            Evaluatable is an option for Cell that specifies whether a cell should be used as input to be evaluated by the Wolfram Language kernel.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Evaluatable
 * Documentation:    web: http://reference.wolfram.com/language/ref/Evaluatable.html
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
fun evaluatable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Evaluatable", arguments.toMutableList(), options)
}
