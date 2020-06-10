package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClearAttributes
 * 
 * Full name:        System`ClearAttributes
 * 
 * Usage:            ClearAttributes[s, attr] removes attr from the list of attributes of the symbol s. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ClearAttributes
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClearAttributes.html
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
fun clearAttributes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClearAttributes", arguments.toMutableList(), options)
}
