package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DataStructureQ
 *
 * Full name:        System`DataStructureQ
 *
 *                   DataStructureQ[ds] yields True if ds is a valid data structure and False otherwise.
 * Usage:            DataStructureQ[ds, type] yields True if ds is a valid data structure of the specified type and False otherwise.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DataStructureQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DataStructureQ.html
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
fun dataStructureQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DataStructureQ", arguments.toMutableList(), options)
}
