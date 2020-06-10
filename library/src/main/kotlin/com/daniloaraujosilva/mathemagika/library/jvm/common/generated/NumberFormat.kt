package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NumberFormat
 * 
 * Full name:        System`NumberFormat
 * 
 * Usage:            NumberFormat is an option for NumberForm and related functions that specifies how the mantissa, base, and exponent should be assembled into a final print form. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NumberFormat
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberFormat.html
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
fun numberFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberFormat", arguments.toMutableList(), options)
}
