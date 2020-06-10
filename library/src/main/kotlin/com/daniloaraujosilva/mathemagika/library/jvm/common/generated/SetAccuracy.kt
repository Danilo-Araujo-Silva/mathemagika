package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SetAccuracy
 * 
 * Full name:        System`SetAccuracy
 * 
 * Usage:            SetAccuracy[expr, a] yields a version of expr in which all numbers have been set to have accuracy a. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SetAccuracy
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetAccuracy.html
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
fun setAccuracy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetAccuracy", arguments.toMutableList(), options)
}
