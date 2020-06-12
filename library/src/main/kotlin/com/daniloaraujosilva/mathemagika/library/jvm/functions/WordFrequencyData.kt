package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WordFrequencyData
 *
 * Full name:        System`WordFrequencyData
 *
 *                   WordFrequencyData[word] gives the frequency of word in typical published English text.
 *                   WordFrequencyData[{word , word , …}] gives an association of frequencies of the word .
 *                                          1      2                                                     i
 *                   WordFrequencyData[word, "TimeSeries"] gives a time series for the frequency of word in typical published English text.
 *                   WordFrequencyData[word, "TimeSeries", datespec] gives a time series for dates specified by datespec.
 * Usage:            WordFrequencyData[word, "prop"] gives property prop of the word frequency.
 *
 *                   IgnoreCase -> False
 * Options:          Language -> English
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WordFrequencyData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordFrequencyData.html
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
fun wordFrequencyData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordFrequencyData", arguments.toMutableList(), options)
}
