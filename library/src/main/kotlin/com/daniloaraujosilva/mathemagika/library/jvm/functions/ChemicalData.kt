package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChemicalData
 *
 * Full name:        System`ChemicalData
 *
 *                   ChemicalData["name", "property"] gives the value of the specified property for the chemical "name".
 *                   ChemicalData["name"] gives a structure diagram for the chemical with the specified name.
 * Usage:            ChemicalData["class"] gives a list of available chemicals in the specified class.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChemicalData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChemicalData.html
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
fun chemicalData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChemicalData", arguments.toMutableList(), options)
}
