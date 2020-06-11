package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateDataStructure
 *
 * Full name:        System`CreateDataStructure
 *
 *                   CreateDataStructure["type", arg , arg , …] creates a data structure with the specified type.
 * Usage:                                           1     2
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CreateDataStructure
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateDataStructure.html
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
fun createDataStructure(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateDataStructure", arguments.toMutableList(), options)
}
