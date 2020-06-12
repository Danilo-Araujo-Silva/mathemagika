package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LongShortTermMemoryLayer
 *
 * Full name:        System`LongShortTermMemoryLayer
 *
 *                   LongShortTermMemoryLayer[n] represents a trainable recurrent layer that takes a sequence of vectors and produces a sequence of vectors, each of size n.
 * Usage:            LongShortTermMemoryLayer[n, opts] includes options for weights and other parameters.
 *
 *                   Dropout -> None
 *                   ForgetGateBiases -> Automatic
 *                   ForgetGateInputWeights -> Automatic
 *                   ForgetGateStateWeights -> Automatic
 *                   Input -> Automatic
 *                   InputGateBiases -> Automatic
 *                   InputGateInputWeights -> Automatic
 *                   InputGateStateWeights -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   MemoryGateBiases -> Automatic
 *                   MemoryGateInputWeights -> Automatic
 *                   MemoryGateStateWeights -> Automatic
 *                   Output -> Automatic
 *                   OutputGateBiases -> Automatic
 *                   OutputGateInputWeights -> Automatic
 * Options:          OutputGateStateWeights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LongShortTermMemoryLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongShortTermMemoryLayer.html
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
fun longShortTermMemoryLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongShortTermMemoryLayer", arguments.toMutableList(), options)
}
