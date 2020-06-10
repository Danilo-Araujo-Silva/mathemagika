package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HoytDistribution
 * 
 * Full name:        System`HoytDistribution
 * 
 * Usage:            HoytDistribution[q, ω] represents a Hoyt distribution with shape parameter q and spread parameter ω.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HoytDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoytDistribution.html
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
fun hoytDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoytDistribution", arguments.toMutableList(), options)
}
