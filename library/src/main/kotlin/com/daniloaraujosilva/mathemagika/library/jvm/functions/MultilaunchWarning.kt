package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MultilaunchWarning
 *
 * Full name:        System`MultilaunchWarning
 *
 * Usage:            MultilaunchWarning is a global option that specifies whether a warning is given when you try to modify user preferences while running two copies of the Wolfram System simultaneously.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MultilaunchWarning
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultilaunchWarning.html
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
fun multilaunchWarning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultilaunchWarning", arguments.toMutableList(), options)
}
