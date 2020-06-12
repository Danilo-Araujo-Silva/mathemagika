package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ElementData
 *
 * Full name:        System`ElementData
 *
 *                   ElementData["name", "property"] gives the value of the specified property for the chemical element "name".
 *                                                                                     th
 * Usage:            ElementData[n, "property"] gives the specified property for the n   chemical element.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ElementData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ElementData.html
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
fun elementData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ElementData", arguments.toMutableList(), options)
}
