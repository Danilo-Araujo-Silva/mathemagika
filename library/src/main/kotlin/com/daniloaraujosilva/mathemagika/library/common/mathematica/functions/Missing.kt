package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Missing
 *
 * Full name:        System`Missing
 *
 *                   Missing[] represents data that is missing.
 *                   Missing["reason"] specifies a reason for the data's being missing.
 * Usage:            Missing["reason", expr] associates the expression expr with the missing data.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Missing
 * Documentation:    web: http://reference.wolfram.com/language/ref/Missing.html
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
fun missing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Missing", arguments.toMutableList(), options)
}
