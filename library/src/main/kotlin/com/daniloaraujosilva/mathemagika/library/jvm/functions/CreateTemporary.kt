package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateTemporary
 *
 * Full name:        System`CreateTemporary
 *
 * Usage:            CreateTemporary[] creates a temporary file with a unique name in the default temporary directory and returns the name of the file.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CreateTemporary
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateTemporary.html
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
fun createTemporary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateTemporary", arguments.toMutableList(), options)
}
