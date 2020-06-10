package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DateFormat
 * 
 * Full name:        System`DateFormat
 * 
 * Usage:            DateFormat is an option that determines the date formatting that is used for DateObject display and for interpretation in Interpreter.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DateFormat
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateFormat.html
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
fun dateFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateFormat", arguments.toMutableList(), options)
}
