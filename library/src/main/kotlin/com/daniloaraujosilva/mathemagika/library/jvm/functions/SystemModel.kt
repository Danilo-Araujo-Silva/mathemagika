package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModel
 *
 * Full name:        System`SystemModel
 *
 *                   SystemModel["model"] gives a representation of the model "model", usable as input to other functions.
 * Usage:            SystemModel["model"]["property"] gives the specified "property" for the model "model".
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModel.html
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
fun systemModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModel", arguments.toMutableList(), options)
}
