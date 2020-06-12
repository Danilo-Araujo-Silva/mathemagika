package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExcludedPhysicalQuantities
 *
 * Full name:        System`ExcludedPhysicalQuantities
 *
 * Usage:            ExcludedPhysicalQuantities is an option for FormulaLookup that specifies physical quantities that should be not used by the formulas returned.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExcludedPhysicalQuantities
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExcludedPhysicalQuantities.html
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
fun excludedPhysicalQuantities(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExcludedPhysicalQuantities", arguments.toMutableList(), options)
}
