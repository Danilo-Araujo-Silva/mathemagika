package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FinancialDerivative
 *
 * Full name:        System`FinancialDerivative
 *
 *                   FinancialDerivative[instrument, params, ambientparams] gives the value of the specified financial instrument.
 * Usage:            FinancialDerivative[instrument, params, ambientparams, prop] computes the specified property prop.
 *
 *                   Caching -> False
 *                   GridSize -> Automatic
 *                   Method -> Automatic
 *                   Paths -> Automatic
 *                   RuntimeTarget -> Generic
 * Options:          Steps -> Automatic
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FinancialDerivative
 * Documentation:    web: http://reference.wolfram.com/language/ref/FinancialDerivative.html
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
fun financialDerivative(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FinancialDerivative", arguments.toMutableList(), options)
}
