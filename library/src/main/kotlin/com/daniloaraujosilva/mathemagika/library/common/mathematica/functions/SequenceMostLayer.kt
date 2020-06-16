package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceMostLayer
 *
 * Full name:        System`SequenceMostLayer
 *
 * Usage:            SequenceMostLayer[] represents a net that takes a sequence of inputs and removes its last element.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceMostLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceMostLayer.html
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
fun sequenceMostLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceMostLayer", arguments.toMutableList(), options)
}
