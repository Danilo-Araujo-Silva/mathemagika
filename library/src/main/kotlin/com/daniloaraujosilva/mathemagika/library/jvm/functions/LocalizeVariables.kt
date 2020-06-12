package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocalizeVariables
 *
 * Full name:        System`LocalizeVariables
 *
 * Usage:            LocalizeVariables is an option to Manipulate that determines whether the values of variables associated with controls should be localized.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalizeVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalizeVariables.html
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
fun localizeVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalizeVariables", arguments.toMutableList(), options)
}
