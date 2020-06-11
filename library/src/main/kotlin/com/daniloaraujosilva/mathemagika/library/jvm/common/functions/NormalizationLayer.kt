package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NormalizationLayer
 *
 * Full name:        System`NormalizationLayer
 *
 *                   NormalizationLayer[] represents a trainable net layer that normalizes its input data across the second and subsequent dimensions and applies an independent scaling and bias to each component of the first dimension.
 *                   NormalizationLayer[aggregationlevels] normalizes its input data across the specified aggregation levels and applies a learned scaling and bias on the remaining levels.
 * Usage:            NormalizationLayer[aggregationlevels, scalinglevels] applies a learned scaling and bias at the specified scaling levels.
 *
 *                   Biases -> Automatic
 *                   Epsilon -> 0.001
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 * Options:          Scaling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NormalizationLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/NormalizationLayer.html
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
fun normalizationLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NormalizationLayer", arguments.toMutableList(), options)
}
