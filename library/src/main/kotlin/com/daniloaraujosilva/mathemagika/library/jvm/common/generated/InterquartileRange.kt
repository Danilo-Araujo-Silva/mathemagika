package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InterquartileRange
 * 
 * Full name:        System`InterquartileRange
 * 
 *                   InterquartileRange[list] gives the difference between the upper and lower quartiles for the elements in list.
 * Usage:            InterquartileRange[dist] gives the difference between the upper and lower quartiles for the distribution dist.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InterquartileRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/InterquartileRange.html
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
fun interquartileRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InterquartileRange", arguments.toMutableList(), options)
}
