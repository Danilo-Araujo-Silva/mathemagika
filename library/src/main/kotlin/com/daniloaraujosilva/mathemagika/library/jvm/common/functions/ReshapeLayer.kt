package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReshapeLayer
 *
 * Full name:        System`ReshapeLayer
 *
 * Usage:            ReshapeLayer[dims] represents a net layer that reinterprets the input to be an array of dimensions dims.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReshapeLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReshapeLayer.html
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
fun reshapeLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReshapeLayer", arguments.toMutableList(), options)
}
