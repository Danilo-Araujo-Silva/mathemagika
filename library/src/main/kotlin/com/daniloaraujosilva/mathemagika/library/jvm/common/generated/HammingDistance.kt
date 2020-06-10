package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HammingDistance
 * 
 * Full name:        System`HammingDistance
 * 
 * Usage:            HammingDistance[u, v] gives the Hamming distance between strings or vectors u and v.
 * 
 * Options:          IgnoreCase -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/HammingDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/HammingDistance.html
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
fun hammingDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HammingDistance", arguments.toMutableList(), options)
}
