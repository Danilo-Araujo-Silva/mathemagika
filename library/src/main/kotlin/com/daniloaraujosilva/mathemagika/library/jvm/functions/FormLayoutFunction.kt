package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FormLayoutFunction
 *
 * Full name:        System`FormLayoutFunction
 *
 * Usage:            FormLayoutFunction is an option for FormObject and FormFunction that can be used to specify how to lay out a form.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FormLayoutFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormLayoutFunction.html
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
fun formLayoutFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormLayoutFunction", arguments.toMutableList(), options)
}
