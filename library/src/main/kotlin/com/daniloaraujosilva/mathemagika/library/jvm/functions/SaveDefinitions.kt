package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SaveDefinitions
 *
 * Full name:        System`SaveDefinitions
 *
 * Usage:            SaveDefinitions is an option to Manipulate and related functions that specifies whether current definitions relevant for the evaluation of the expression being manipulated should automatically be saved.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SaveDefinitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SaveDefinitions.html
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
fun saveDefinitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SaveDefinitions", arguments.toMutableList(), options)
}
