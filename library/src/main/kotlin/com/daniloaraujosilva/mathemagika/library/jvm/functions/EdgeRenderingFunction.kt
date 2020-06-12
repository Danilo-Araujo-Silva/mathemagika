package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeRenderingFunction
 *
 * Full name:        System`EdgeRenderingFunction
 *
 * Usage:            EdgeRenderingFunction is an option for GraphPlot and related functions that gives a function to generate the graphics primitives to use in rendering each edge.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeRenderingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeRenderingFunction.html
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
fun edgeRenderingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeRenderingFunction", arguments.toMutableList(), options)
}
