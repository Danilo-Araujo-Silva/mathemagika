package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UpValues
 * 
 * Full name:        System`UpValues
 * 
 * Usage:            UpValues[f] gives a list of transformation rules corresponding to all upvalues defined for the symbol f. 
 * 
 * Options:          Sort -> True
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/UpValues
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpValues.html
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
fun upValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpValues", arguments.toMutableList(), options)
}
