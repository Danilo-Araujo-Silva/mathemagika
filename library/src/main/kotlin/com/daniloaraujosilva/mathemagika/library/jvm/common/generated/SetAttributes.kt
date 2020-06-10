package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SetAttributes
 * 
 * Full name:        System`SetAttributes
 * 
 * Usage:            SetAttributes[s, attr] adds attr to the list of attributes of the symbol s. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SetAttributes
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetAttributes.html
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
fun setAttributes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetAttributes", arguments.toMutableList(), options)
}
