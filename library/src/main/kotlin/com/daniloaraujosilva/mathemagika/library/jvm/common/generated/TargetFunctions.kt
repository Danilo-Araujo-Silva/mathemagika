package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TargetFunctions
 * 
 * Full name:        System`TargetFunctions
 * 
 * Usage:            TargetFunctions is an option for functions such as ComplexExpand and FindDistribution that specifies what functions to attempt to generate in the output. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TargetFunctions
 * Documentation:    web: http://reference.wolfram.com/language/ref/TargetFunctions.html
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
fun targetFunctions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TargetFunctions", arguments.toMutableList(), options)
}
