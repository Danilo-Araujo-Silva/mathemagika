package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BasicRecurrentLayer
 *
 * Full name:        System`BasicRecurrentLayer
 *
 *                   BasicRecurrentLayer[n] represents a trainable recurrent layer that takes a sequence of vectors and produces a sequence of vectors each of size n.
 * Usage:            BasicRecurrentLayer[n, opts] includes options for initial weights and other parameters.
 *
 *                   Biases -> Automatic
 *                   Dropout -> None
 *                   Input -> Automatic
 *                   InputWeights -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 * Options:          StateWeights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BasicRecurrentLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/BasicRecurrentLayer.html
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
fun basicRecurrentLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BasicRecurrentLayer", arguments.toMutableList(), options)
}
