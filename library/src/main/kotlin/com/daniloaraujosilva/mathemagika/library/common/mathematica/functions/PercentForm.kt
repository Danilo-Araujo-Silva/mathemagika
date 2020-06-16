package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PercentForm
 *
 * Full name:        System`PercentForm
 *
 *                   PercentForm[expr] prints with numbers in expr given as percentages.
 * Usage:            PercentForm[expr, n] prints with approximate real numbers in expr given as percentages to n-digit precision.
 *
 *                   DefaultPrintPrecision -> 4
 *                   DigitBlock -> Infinity
 *                   NumberPadding -> {, 0}
 *                   NumberPoint -> Automatic
 *                   NumberSeparator -> {,,  }
 * Options:          SignPadding -> {False, True}
 *
 *                   NHoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PercentForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/PercentForm.html
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
fun percentForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PercentForm", arguments.toMutableList(), options)
}
