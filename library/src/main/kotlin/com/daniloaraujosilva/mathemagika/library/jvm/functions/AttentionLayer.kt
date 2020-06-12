package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AttentionLayer
 *
 * Full name:        System`AttentionLayer
 *
 *                   AttentionLayer[] represents a trainable net layer that learns to pay attention to certain portions of its input.
 *                   AttentionLayer[net] specifies a particular net to give scores for portions of the input.
 * Usage:            AttentionLayer[net, opts] includes options for weight normalization, masking and other parameters.
 *
 *                   Key -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Mask -> None
 *                   MultiHead -> False
 *                   Output -> Automatic
 *                   Query -> Automatic
 *                   ScoreRescaling -> None
 * Options:          Value -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AttentionLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/AttentionLayer.html
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
fun attentionLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AttentionLayer", arguments.toMutableList(), options)
}
