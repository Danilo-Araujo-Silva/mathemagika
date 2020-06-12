package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphData
 *
 * Full name:        System`GraphData
 *
 *                   GraphData[name] gives a graph with the specified name.
 *                   GraphData[entity] gives the graph corresponding to the graph entity.
 *                   GraphData[entity, property] gives the value of the property for the specified graph entity.
 *                   GraphData[class] gives a list of available named graphs in the specified graph class.
 * Usage:            GraphData[n] gives a list of available named graphs with n vertices.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphData.html
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
fun graphData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphData", arguments.toMutableList(), options)
}
