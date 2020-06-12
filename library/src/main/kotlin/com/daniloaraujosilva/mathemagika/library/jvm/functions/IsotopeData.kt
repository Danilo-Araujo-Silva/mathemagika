package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IsotopeData
 *
 * Full name:        System`IsotopeData
 *
 *                   IsotopeData[{Z, A}, "property"] gives the value of the specified property for the isotope with atomic number Z and mass number A.
 * Usage:            IsotopeData["name", "property"] gives the value of the property for the named isotope.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IsotopeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/IsotopeData.html
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
fun isotopeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IsotopeData", arguments.toMutableList(), options)
}
