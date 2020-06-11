package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NormalsFunction
 *
 * Full name:        System`NormalsFunction
 *
 * Usage:            NormalsFunction is an option for Plot3D and related functions that specifies a function to apply to determine the effective surface normals at every point.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NormalsFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/NormalsFunction.html
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
fun normalsFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NormalsFunction", arguments.toMutableList(), options)
}
