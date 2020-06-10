package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QuartileSkewness
 * 
 * Full name:        System`QuartileSkewness
 * 
 *                   QuartileSkewness[list] gives the coefficient of quartile skewness for the elements in list.
 * Usage:            QuartileSkewness[dist] gives the coefficient of quartile skewness for the distribution dist.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QuartileSkewness
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuartileSkewness.html
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
fun quartileSkewness(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuartileSkewness", arguments.toMutableList(), options)
}
