package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FixedPoint
 * 
 * Full name:        System`FixedPoint
 * 
 * Usage:            FixedPoint[f, expr] starts with expr, then applies f repeatedly until the result no longer changes. 
 * 
 * Options:          SameTest -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FixedPoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/FixedPoint.html
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
fun fixedPoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FixedPoint", arguments.toMutableList(), options)
}
