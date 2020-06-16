package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinearLayer
 *
 * Full name:        System`LinearLayer
 *
 *                   LinearLayer[n] represents a trainable, fully connected net layer that computes w . x + b with output vector of size n.
 *                   LinearLayer[{n , n , …}] represents a layer that outputs an array of dimensions n  × n  × ….
 *                                 1   2                                                              1    2
 *                   LinearLayer[] leaves the dimensions of the output array to be inferred from context.
 * Usage:            LinearLayer[n, opts] includes options for initial weights and other parameters.
 *
 *                   Biases -> Automatic
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinearLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearLayer.html
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
fun linearLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearLayer", arguments.toMutableList(), options)
}
