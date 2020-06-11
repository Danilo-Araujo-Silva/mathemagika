package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PsychrometricPropertyData
 *
 * Full name:        System`PsychrometricPropertyData
 *
 *                   PsychrometricPropertyData[spec] returns the psychrometric properties of moist air for the specified parameters.
 * Usage:            PsychrometricPropertyData[spec, property] returns the specified property for the given parameters.
 *
 * Options:          UnitSystem -> Metric
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PsychrometricPropertyData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PsychrometricPropertyData.html
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
fun psychrometricPropertyData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PsychrometricPropertyData", arguments.toMutableList(), options)
}
