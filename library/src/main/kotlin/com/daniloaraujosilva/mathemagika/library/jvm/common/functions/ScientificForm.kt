package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScientificForm
 *
 * Full name:        System`ScientificForm
 *
 *                   ScientificForm[expr] prints with all real numbers in expr given in scientific notation.
 * Usage:            ScientificForm[expr, n] prints with numbers given to n‐digit precision.
 *
 *                   DefaultPrintPrecision -> Automatic
 *                   DigitBlock -> Infinity
 *                   ExponentFunction -> Automatic
 *                   ExponentStep -> 1
 *                   NumberFormat -> Automatic
 *                   NumberMultiplier -> ×
 *                   NumberPadding -> {, }
 *                   NumberPoint -> .
 *                   NumberSeparator -> {,,  }
 *                   NumberSigns -> {-, }
 *                   ScientificNotationThreshold -> {0, 1}
 * Options:          SignPadding -> False
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScientificForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScientificForm.html
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
fun scientificForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScientificForm", arguments.toMutableList(), options)
}
