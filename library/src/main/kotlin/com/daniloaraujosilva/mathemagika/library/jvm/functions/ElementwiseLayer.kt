package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ElementwiseLayer
 *
 * Full name:        System`ElementwiseLayer
 *
 *                   ElementwiseLayer[f] represents a net layer that applies a unary function f to every element of the input array.
 * Usage:            ElementwiseLayer["name"] applies the function specified by "name".
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ElementwiseLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ElementwiseLayer.html
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
fun elementwiseLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ElementwiseLayer", arguments.toMutableList(), options)
}
