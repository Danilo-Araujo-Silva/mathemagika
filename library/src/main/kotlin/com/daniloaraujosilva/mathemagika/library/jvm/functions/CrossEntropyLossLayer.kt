package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CrossEntropyLossLayer
 *
 * Full name:        System`CrossEntropyLossLayer
 *
 *                   CrossEntropyLossLayer["Index"] represents a net layer that computes the cross-entropy loss by comparing input class probability vectors with indices representing the target class.
 *                   CrossEntropyLossLayer["Probabilities"] represents a net layer that computes the cross-entropy loss by comparing input class probability vectors with target class probability vectors.
 * Usage:            CrossEntropyLossLayer["Binary"] represents a net layer that computes the binary cross-entropy loss by comparing input probability scalars with target probability scalars, where each probability represents a binary choice.
 *
 *                   Input -> Automatic
 *                   Loss -> Automatic
 * Options:          Target -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CrossEntropyLossLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/CrossEntropyLossLayer.html
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
fun crossEntropyLossLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CrossEntropyLossLayer", arguments.toMutableList(), options)
}
