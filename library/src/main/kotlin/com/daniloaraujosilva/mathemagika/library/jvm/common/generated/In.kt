package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             In
 * 
 * Full name:        System`In
 * 
 *                                                                                              th
 * Usage:            In[n] is a global object that is assigned to have a delayed value of the n   input line. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NHoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/In
 * Documentation:    web: http://reference.wolfram.com/language/ref/In.html
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
fun `in`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("In", arguments.toMutableList(), options)
}
