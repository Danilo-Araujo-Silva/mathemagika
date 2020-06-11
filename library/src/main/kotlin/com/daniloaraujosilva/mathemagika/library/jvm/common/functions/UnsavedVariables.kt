package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnsavedVariables
 *
 * Full name:        System`UnsavedVariables
 *
 * Usage:            UnsavedVariables is an option for Manipulate, DynamicModule, and related functions that specifies local symbols that should not be saved when the notebook containing them is saved.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnsavedVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnsavedVariables.html
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
fun unsavedVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnsavedVariables", arguments.toMutableList(), options)
}
