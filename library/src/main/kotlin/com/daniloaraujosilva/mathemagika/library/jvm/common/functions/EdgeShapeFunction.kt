package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeShapeFunction
 *
 * Full name:        System`EdgeShapeFunction
 *
 * Usage:            EdgeShapeFunction is an option and annotation for Graph and related functions that specifies a function to use to generate primitives for rendering each edge.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeShapeFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeShapeFunction.html
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
fun edgeShapeFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeShapeFunction", arguments.toMutableList(), options)
}
