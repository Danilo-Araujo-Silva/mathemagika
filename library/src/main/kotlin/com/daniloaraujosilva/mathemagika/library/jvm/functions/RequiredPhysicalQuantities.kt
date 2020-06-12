package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RequiredPhysicalQuantities
 *
 * Full name:        System`RequiredPhysicalQuantities
 *
 * Usage:            RequiredPhysicalQuantities is an option for FormulaLookup that specifies physical quantities that must be used by the formulas returned.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RequiredPhysicalQuantities
 * Documentation:    web: http://reference.wolfram.com/language/ref/RequiredPhysicalQuantities.html
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
fun requiredPhysicalQuantities(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RequiredPhysicalQuantities", arguments.toMutableList(), options)
}
