package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PrecisionGoal
 * 
 * Full name:        System`PrecisionGoal
 * 
 * Usage:            PrecisionGoal is an option for various numerical operations which specifies how many effective digits of precision should be sought in the final result. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PrecisionGoal
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrecisionGoal.html
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
fun precisionGoal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrecisionGoal", arguments.toMutableList(), options)
}
