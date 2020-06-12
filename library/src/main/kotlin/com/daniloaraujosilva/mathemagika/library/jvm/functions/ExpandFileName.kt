package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExpandFileName
 *
 * Full name:        System`ExpandFileName
 *
 * Usage:            ExpandFileName["name"] textually expands name to have the form of an absolute file name for your operating system.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExpandFileName
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpandFileName.html
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
fun expandFileName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpandFileName", arguments.toMutableList(), options)
}
