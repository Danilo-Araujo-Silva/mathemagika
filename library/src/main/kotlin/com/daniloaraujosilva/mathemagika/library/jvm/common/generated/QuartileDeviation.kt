package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QuartileDeviation
 * 
 * Full name:        System`QuartileDeviation
 * 
 *                   QuartileDeviation[list] gives the quartile deviation or semi-interquartile range of the elements in list.
 * Usage:            QuartileDeviation[dist] gives the quartile deviation or semi-interquartile range of the distribution dist.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QuartileDeviation
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuartileDeviation.html
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
fun quartileDeviation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuartileDeviation", arguments.toMutableList(), options)
}
