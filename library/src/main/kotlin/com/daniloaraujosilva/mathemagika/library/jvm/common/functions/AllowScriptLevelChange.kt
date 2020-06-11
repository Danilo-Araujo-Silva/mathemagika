package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AllowScriptLevelChange
 *
 * Full name:        System`AllowScriptLevelChange
 *
 * Usage:            AllowScriptLevelChange is an option for fractions and grids that controls whether certain operators, such as ∑, ∏, and ∫, always appear smaller than normal size.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AllowScriptLevelChange
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowScriptLevelChange.html
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
fun allowScriptLevelChange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowScriptLevelChange", arguments.toMutableList(), options)
}
