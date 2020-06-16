package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CepstrumArray
 *
 * Full name:        System`CepstrumArray
 *
 *                   CepstrumArray[data] computes the power cepstrum of data.
 * Usage:            CepstrumArray[data, type] computes the specified type of cepstrum of data.
 *
 * Options:          FourierParameters -> {1, -1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CepstrumArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/CepstrumArray.html
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
fun cepstrumArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CepstrumArray", arguments.toMutableList(), options)
}
