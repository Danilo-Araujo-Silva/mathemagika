package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BatchNormalizationLayer
 *
 * Full name:        System`BatchNormalizationLayer
 *
 * Usage:            BatchNormalizationLayer[] represents a trainable net layer that normalizes its input data by learning the data mean and variance.
 *
 *                   Biases -> Automatic
 *                   Epsilon -> 0.001
 *                   Input -> Automatic
 *                   Interleaving -> False
 *                   LearningRateMultipliers -> Automatic
 *                   Momentum -> 0.9
 *                   MovingMean -> Automatic
 *                   MovingVariance -> Automatic
 *                   Output -> Automatic
 * Options:          Scaling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BatchNormalizationLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/BatchNormalizationLayer.html
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
fun batchNormalizationLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BatchNormalizationLayer", arguments.toMutableList(), options)
}
