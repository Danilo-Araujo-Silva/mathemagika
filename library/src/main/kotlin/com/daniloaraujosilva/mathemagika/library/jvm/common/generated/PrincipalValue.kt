package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PrincipalValue
 * 
 * Full name:        System`PrincipalValue
 * 
 * Usage:            PrincipalValue is an option for Integrate that specifies whether the Cauchy principal value should be found for a definite integral. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PrincipalValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrincipalValue.html
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
fun principalValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrincipalValue", arguments.toMutableList(), options)
}
