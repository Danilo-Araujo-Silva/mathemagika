package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ResponseForm
 *
 * Full name:        System`ResponseForm
 *
 *                   ResponseForm[expr, "fmt"] represents a response record to be given in a specified format when requested during the execution of a function specified by APIFunction, FormFunction, etc.
 *                   ResponseForm[expr, "fmt", {elem , elem , …}] includes only the response record elements elem .
 * Usage:                                           1      2                                                     i
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResponseForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResponseForm.html
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
fun responseForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResponseForm", arguments.toMutableList(), options)
}
