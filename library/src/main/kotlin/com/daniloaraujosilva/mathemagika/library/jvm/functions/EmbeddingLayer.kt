package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EmbeddingLayer
 *
 * Full name:        System`EmbeddingLayer
 *
 *                   EmbeddingLayer[size, n] represents a trainable net layer that embeds integers between 1 and n into a continuous vector space of dimension size.
 * Usage:            EmbeddingLayer[size] leaves the n to be inferred from context.
 *
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EmbeddingLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmbeddingLayer.html
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
fun embeddingLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmbeddingLayer", arguments.toMutableList(), options)
}
