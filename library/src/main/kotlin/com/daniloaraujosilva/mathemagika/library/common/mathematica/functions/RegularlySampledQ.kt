package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegularlySampledQ
 *
 * Full name:        System`RegularlySampledQ
 *
 * Usage:            RegularlySampledQ[tseries] gives True if tseries is a regular time series, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegularlySampledQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegularlySampledQ.html
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
fun regularlySampledQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegularlySampledQ", arguments.toMutableList(), options)
}
