package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Switch
 * 
 * Full name:        System`Switch
 * 
 *                   Switch[expr, form , value , form , value , …] evaluates expr, then compares it with each of the form  in turn, evaluating and returning the value  corresponding to the first match found. 
 * Usage:                             1       1      2       2                                                           i                                            i
 * 
 * Options:          None
 * 
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Switch
 * Documentation:    web: http://reference.wolfram.com/language/ref/Switch.html
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
fun switch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Switch", arguments.toMutableList(), options)
}
