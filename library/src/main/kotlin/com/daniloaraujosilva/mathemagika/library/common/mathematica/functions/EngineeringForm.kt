package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EngineeringForm
 *
 * Full name:        System`EngineeringForm
 *
 *                   EngineeringForm[expr] prints with all real numbers in expr given in engineering notation.
 * Usage:            EngineeringForm[expr, n] prints with numbers given to n‐digit precision.
 *
 *                   DefaultPrintPrecision -> Automatic
 *                   DigitBlock -> Infinity
 *                   ExponentFunction -> Automatic
 *                   ExponentStep -> 3
 *                   NumberFormat -> Automatic
 *                   NumberMultiplier -> ×
 *                   NumberPadding -> {, }
 *                   NumberPoint -> .
 *                   NumberSeparator -> {,,  }
 *                   NumberSigns -> {-, }
 *                   ScientificNotationThreshold -> {0, 3}
 * Options:          SignPadding -> False
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EngineeringForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/EngineeringForm.html
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
fun engineeringForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EngineeringForm", arguments.toMutableList(), options)
}
