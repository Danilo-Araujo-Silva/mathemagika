package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FiniteGroupData
 * 
 * Full name:        System`FiniteGroupData
 * 
 *                   FiniteGroupData[name, "property"] gives the value of the specified property for the finite group specified by name.
 * Usage:            FiniteGroupData["class"] gives a list of finite groups in the specified class.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FiniteGroupData
 * Documentation:    web: http://reference.wolfram.com/language/ref/FiniteGroupData.html
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
fun finiteGroupData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FiniteGroupData", arguments.toMutableList(), options)
}
