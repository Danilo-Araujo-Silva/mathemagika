package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CompanyData
 *
 * Full name:        System`CompanyData
 *
 *                   CompanyData[entity, property] gives the value of the specified property for the company entity.
 *                   CompanyData[{entity , entity , …}, property] gives a list of property values for the specified company entities.
 *                                      1        2
 * Usage:            CompanyData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompanyData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompanyData.html
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
fun companyData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompanyData", arguments.toMutableList(), options)
}
