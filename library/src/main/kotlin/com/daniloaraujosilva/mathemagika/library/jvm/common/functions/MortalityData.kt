package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MortalityData
 *
 * Full name:        System`MortalityData
 *
 *                   MortalityData[spec] gives the values of all properties for the specified demographic.
 * Usage:            MortalityData[spec, property] gives the value of the specified property for the specified demographic.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MortalityData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MortalityData.html
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
fun mortalityData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MortalityData", arguments.toMutableList(), options)
}
