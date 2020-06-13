package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MeshFunctions
 *
 * Full name:        System`MeshFunctions
 *
 * Usage:            MeshFunctions is an option for plotting functions that specifies functions to use to determine the placement of mesh divisions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshFunctions
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshFunctions.html
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
fun meshFunctions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshFunctions", arguments.toMutableList(), options)
}
