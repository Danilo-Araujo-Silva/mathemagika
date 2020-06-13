package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ThermodynamicData
 *
 * Full name:        System`ThermodynamicData
 *
 *                   ThermodynamicData["name", "property"] gives the value of the specific property for the substance "name".
 *                   ThermodynamicData["name", "property", {"Temperature"  quantity , "Pressure"  quantity}] gives the value of the specific property for the substance "name" at the specified temperature and pressure.
 * Usage:                                                                           1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ThermodynamicData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ThermodynamicData.html
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
fun thermodynamicData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ThermodynamicData", arguments.toMutableList(), options)
}
