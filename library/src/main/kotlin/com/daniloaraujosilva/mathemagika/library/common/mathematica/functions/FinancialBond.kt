package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FinancialBond
 *
 * Full name:        System`FinancialBond
 *
 *                   FinancialBond[params, ambientparams] gives the value of a financial bond instrument.
 * Usage:            FinancialBond[params, ambientparams, prop] computes the specified property prop.
 *
 *                   Assumptions :> $Assumptions
 *                   ClosedForm -> True
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FinancialBond
 * Documentation:    web: http://reference.wolfram.com/language/ref/FinancialBond.html
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
fun financialBond(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FinancialBond", arguments.toMutableList(), options)
}
