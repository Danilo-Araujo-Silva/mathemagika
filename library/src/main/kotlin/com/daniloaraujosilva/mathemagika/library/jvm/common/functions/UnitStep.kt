package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnitStep
 *
 * Full name:        System`UnitStep
 *
 *                   UnitStep[x] represents the unit step function, equal to 0 for x < 0 and 1 for x ≥ 0.
 *                   UnitStep[x , x , …] represents the multidimensional unit step function which is 1 only if none of the x  are negative.
 * Usage:                      1   2                                                                                        i
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnitStep
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitStep.html
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
fun unitStep(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitStep", arguments.toMutableList(), options)
}
