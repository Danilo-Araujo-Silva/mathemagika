package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DecimalForm
 *
 * Full name:        System`DecimalForm
 *
 *                   DecimalForm[expr] prints with approximate real numbers in expr always given in decimal form, without scientific notation.
 *                   DecimalForm[expr, n] prints with approximate real numbers given in decimal form to n-digit precision.
 * Usage:            DecimalForm[expr, {n, f}] prints with approximate real numbers having n digits, with f digits to the right of the decimal point.
 *
 *                   DefaultPrintPrecision -> Automatic
 *                   DigitBlock -> Infinity
 *                   ExponentFunction -> Automatic
 *                   ExponentStep -> 1
 *                   NumberFormat -> Automatic
 *                   NumberMultiplier -> ×
 *                   NumberPadding -> {, 0}
 *                   NumberPoint -> .
 *                   NumberSeparator -> {,,  }
 *                   NumberSigns -> {-, }
 *                   ScientificNotationThreshold -> {-Infinity, Infinity}
 * Options:          SignPadding -> False
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DecimalForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/DecimalForm.html
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
fun decimalForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DecimalForm", arguments.toMutableList(), options)
}
