package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DateValue
 *
 * Full name:        System`DateValue
 *
 *                   DateValue["elem"] gives the specified element of the current date and time.
 *                   DateValue[{elem , elem , …}] gives a list of the specified elements of the current date and time.
 *                                  1      2
 *                   DateValue[date, elem] gives the specified element of the specified date.
 * Usage:            DateValue[date, elem, form] gives the result in the specified form.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateValue.html
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
fun dateValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateValue", arguments.toMutableList(), options)
}
