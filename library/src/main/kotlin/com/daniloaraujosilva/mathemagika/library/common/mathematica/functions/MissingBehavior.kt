package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MissingBehavior
 *
 * Full name:        System`MissingBehavior
 *
 * Usage:            MissingBehavior is an option to Query and related functions that specifies how expressions with head Missing should be interpreted in the context of other functions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MissingBehavior
 * Documentation:    web: http://reference.wolfram.com/language/ref/MissingBehavior.html
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
fun missingBehavior(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MissingBehavior", arguments.toMutableList(), options)
}
