package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceReverseLayer
 *
 * Full name:        System`SequenceReverseLayer
 *
 * Usage:            SequenceReverseLayer[] represents a net that reverses the order of an input sequence.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceReverseLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceReverseLayer.html
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
fun sequenceReverseLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceReverseLayer", arguments.toMutableList(), options)
}
