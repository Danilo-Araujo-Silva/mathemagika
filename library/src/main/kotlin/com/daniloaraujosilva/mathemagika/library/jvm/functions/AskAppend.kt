package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AskAppend
 *
 * Full name:        System`AskAppend
 *
 *                   AskAppend["key"] is a construct for use inside AskFunction that asks for a new value, appends it to the current value associated with "key", and returns the resulting list.
 * Usage:            AskAppend["key"  formspec] uses formspec to define how input should be requested and interpreted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AskAppend
 * Documentation:    web: http://reference.wolfram.com/language/ref/AskAppend.html
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
fun askAppend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AskAppend", arguments.toMutableList(), options)
}
