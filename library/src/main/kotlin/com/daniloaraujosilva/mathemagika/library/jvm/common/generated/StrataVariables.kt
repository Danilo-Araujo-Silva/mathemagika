package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StrataVariables
 * 
 * Full name:        System`StrataVariables
 * 
 * Usage:            StrataVariables is an option for fitting functions such as CoxModelFit that specify the variables on which the model should be stratified. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StrataVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/StrataVariables.html
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
fun strataVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StrataVariables", arguments.toMutableList(), options)
}
