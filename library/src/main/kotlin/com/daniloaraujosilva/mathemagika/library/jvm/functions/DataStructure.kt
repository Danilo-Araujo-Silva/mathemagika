package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DataStructure
 *
 * Full name:        System`DataStructure
 *
 * Usage:            DataStructure["type", data] represents a data structure.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DataStructure
 * Documentation:    web: http://reference.wolfram.com/language/ref/DataStructure.html
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
fun dataStructure(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DataStructure", arguments.toMutableList(), options)
}
