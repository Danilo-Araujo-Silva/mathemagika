package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FixedPointList
 * 
 * Full name:        System`FixedPointList
 * 
 * Usage:            FixedPointList[f, expr] generates a list giving the results of applying f repeatedly, starting with expr, until the results no longer change. 
 * 
 * Options:          SameTest -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FixedPointList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FixedPointList.html
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
fun fixedPointList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FixedPointList", arguments.toMutableList(), options)
}
