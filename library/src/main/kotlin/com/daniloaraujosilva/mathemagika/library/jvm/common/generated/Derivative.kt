package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Derivative
 * 
 * Full name:        System`Derivative
 * 
 *                   f ' represents the derivative of a function f of one argument. 
 *                   Derivative[n , n , …][f] is the general form, representing a function obtained from f by differentiating n  times with respect to the first argument, n  times with respect to the second argument, and so on. 
 * Usage:                        1   2                                                                                         1                                            2
 * 
 * Options:          None
 * 
 * Attributes:       NHoldAll
 * 
 *                   local: paclet:ref/Derivative
 * Documentation:    web: http://reference.wolfram.com/language/ref/Derivative.html
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
fun derivative(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Derivative", arguments.toMutableList(), options)
}
