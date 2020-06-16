package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GatedRecurrentLayer
 *
 * Full name:        System`GatedRecurrentLayer
 *
 *                   GatedRecurrentLayer[n] represents a trainable recurrent layer that takes a sequence of vectors and produces a sequence of vectors each of size n.
 * Usage:            GatedRecurrentLayer[n, opts] includes options for initial weights and other parameters.
 *
 *                   Dropout -> None
 *                   Input -> Automatic
 *                   InputGateBiases -> Automatic
 *                   InputGateInputWeights -> Automatic
 *                   InputGateStateWeights -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   MemoryGateBiases -> Automatic
 *                   MemoryGateInputWeights -> Automatic
 *                   MemoryGateStateWeights -> Automatic
 *                   Output -> Automatic
 *                   ResetGateBiases -> Automatic
 *                   ResetGateInputWeights -> Automatic
 * Options:          ResetGateStateWeights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GatedRecurrentLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/GatedRecurrentLayer.html
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
fun gatedRecurrentLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GatedRecurrentLayer", arguments.toMutableList(), options)
}
