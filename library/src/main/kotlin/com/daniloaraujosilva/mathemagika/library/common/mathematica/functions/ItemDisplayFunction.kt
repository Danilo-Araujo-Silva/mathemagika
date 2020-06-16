package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ItemDisplayFunction
 *
 * Full name:        System`ItemDisplayFunction
 *
 * Usage:            ItemDisplayFunction is an option for Dataset that specifies a function to apply to items before displaying them.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ItemDisplayFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ItemDisplayFunction.html
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
fun itemDisplayFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ItemDisplayFunction", arguments.toMutableList(), options)
}
