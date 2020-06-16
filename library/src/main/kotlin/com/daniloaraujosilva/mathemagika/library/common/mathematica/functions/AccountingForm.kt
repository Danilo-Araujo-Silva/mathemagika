package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AccountingForm
 *
 * Full name:        System`AccountingForm
 *
 *                   AccountingForm[expr] prints with all numbers in expr given in standard accounting notation.
 * Usage:            AccountingForm[expr, n] prints with numbers given to n‐digit precision.
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
 *                   NumberSigns -> {{(, )}, }
 *                   ScientificNotationThreshold -> {-Infinity, Infinity}
 * Options:          SignPadding -> False
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AccountingForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/AccountingForm.html
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
fun accountingForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AccountingForm", arguments.toMutableList(), options)
}
