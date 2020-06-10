package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Eliminate
 * 
 * Full name:        System`Eliminate
 * 
 * Usage:            Eliminate[eqns, vars] eliminates variables between a set of simultaneous equations. 
 * 
 *                   InverseFunctions -> Automatic
 *                   MakeRules -> False
 *                   Method -> 1
 *                   Mode -> Generic
 *                   Sort -> True
 *                   VerifySolutions -> Automatic
 * Options:          WorkingPrecision -> Infinity
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Eliminate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Eliminate.html
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
fun eliminate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Eliminate", arguments.toMutableList(), options)
}
