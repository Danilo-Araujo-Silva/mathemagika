package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParametricRampLayer
 *
 * Full name:        System`ParametricRampLayer
 *
 *                   ParametricRampLayer[] represents a net layer that computes a leaky ReLU activation with a slope that can be learned.
 * Usage:            ParametricRampLayer[levels] specifies the levels on which each dimension has a specific slope.
 *
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 * Options:          Slope -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParametricRampLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParametricRampLayer.html
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
fun parametricRampLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParametricRampLayer", arguments.toMutableList(), options)
}
