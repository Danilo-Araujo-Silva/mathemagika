package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PaddedForm
 * 
 * Full name:        System`PaddedForm
 * 
 *                   PaddedForm[expr, n] prints with all numbers in expr padded to leave room for a total of n digits. 
 * Usage:            PaddedForm[expr, {n, f}] prints with approximate real numbers having exactly f digits to the right of the decimal point. 
 * 
 *                   DefaultPrintPrecision -> Automatic
 *                   DigitBlock -> Infinity
 *                   ExponentFunction -> Automatic
 *                   ExponentStep -> 1
 *                   NumberFormat -> Automatic
 *                   NumberMultiplier -> ×
 *                   NumberPadding -> { , 0}
 *                   NumberPoint -> .
 *                   NumberSeparator -> {,,  }
 *                   NumberSigns -> {-, }
 *                   ScientificNotationThreshold -> {-5, 6}
 * Options:          SignPadding -> False
 * 
 *                   NHoldRest
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PaddedForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/PaddedForm.html
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
fun paddedForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PaddedForm", arguments.toMutableList(), options)
}
