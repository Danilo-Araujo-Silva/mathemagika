package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateIntermediateDirectories
 *
 * Full name:        System`CreateIntermediateDirectories
 *
 * Usage:            CreateIntermediateDirectories is an option for CreateDirectory and related functions that specifies whether to create intermediate directories in a directory path specified.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CreateIntermediateDirectories
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateIntermediateDirectories.html
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
fun createIntermediateDirectories(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateIntermediateDirectories", arguments.toMutableList(), options)
}
