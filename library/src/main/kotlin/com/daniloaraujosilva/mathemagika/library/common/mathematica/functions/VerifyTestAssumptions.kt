package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VerifyTestAssumptions
 *
 * Full name:        System`VerifyTestAssumptions
 *
 * Usage:            VerifyTestAssumptions is an option to LocationTest and similar functions that controls which assumptions to verify through diagnostic tests.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VerifyTestAssumptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifyTestAssumptions.html
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
fun verifyTestAssumptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifyTestAssumptions", arguments.toMutableList(), options)
}
