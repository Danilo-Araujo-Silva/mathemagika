package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InsertionFunction
 *
 * Full name:        System`InsertionFunction
 *
 * Usage:            InsertionFunction is an option for template functions that specifies how expressions are to be processed before they are inserted when the template is applied.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/InsertionFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/InsertionFunction.html
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
fun insertionFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InsertionFunction", arguments.toMutableList(), options)
}
