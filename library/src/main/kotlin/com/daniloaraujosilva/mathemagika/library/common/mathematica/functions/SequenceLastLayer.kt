package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceLastLayer
 *
 * Full name:        System`SequenceLastLayer
 *
 * Usage:            SequenceLastLayer[] represents a net that takes a sequence of inputs and returns the last element of the sequence.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceLastLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceLastLayer.html
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
fun sequenceLastLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceLastLayer", arguments.toMutableList(), options)
}
