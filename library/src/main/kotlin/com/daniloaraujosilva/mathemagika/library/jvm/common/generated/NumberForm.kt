package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NumberForm
 * 
 * Full name:        System`NumberForm
 * 
 *                   NumberForm[expr, n] prints with approximate real numbers in expr given to n‐digit precision. 
 *                   NumberForm[expr, {n, f}] prints with approximate real numbers having n digits, with f digits to the right of the decimal point.
 * Usage:            NumberForm[expr] prints using the default options of NumberForm.
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
 *                   ScientificNotationThreshold -> {-5, 6}
 * Options:          SignPadding -> False
 * 
 *                   NHoldRest
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NumberForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberForm.html
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
fun numberForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberForm", arguments.toMutableList(), options)
}
