package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetSystemModel
 *
 * Full name:        System`SetSystemModel
 *
 * Usage:            SetSystemModel[model, spec] changes model parameters, initializations or other properties in place.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SetSystemModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetSystemModel.html
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
fun setSystemModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetSystemModel", arguments.toMutableList(), options)
}