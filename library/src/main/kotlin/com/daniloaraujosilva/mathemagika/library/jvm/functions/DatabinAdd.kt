package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DatabinAdd
 *
 * Full name:        System`DatabinAdd
 *
 * Usage:            DatabinAdd[bin, data] adds the specified data to a databin.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatabinAdd
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatabinAdd.html
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
fun databinAdd(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatabinAdd", arguments.toMutableList(), options)
}
