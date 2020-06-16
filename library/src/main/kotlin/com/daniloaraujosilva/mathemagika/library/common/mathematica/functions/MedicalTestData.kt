package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MedicalTestData
 *
 * Full name:        System`MedicalTestData
 *
 *                   MedicalTestData[entity, property] gives the value of the specified property for the medical test entity.
 *                   MedicalTestData[{entity , entity , …}, property] gives a list of property values for the specified medical test entities.
 *                                          1        2
 * Usage:            MedicalTestData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MedicalTestData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MedicalTestData.html
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
fun medicalTestData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MedicalTestData", arguments.toMutableList(), options)
}
