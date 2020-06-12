package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DropoutLayer
 *
 * Full name:        System`DropoutLayer
 *
 *                   DropoutLayer[] represents a net layer that sets its input elements to zero with probability 0.5 during training.
 * Usage:            DropoutLayer[p] sets its input elements to zero with probability p during training.
 *
 *                   Input -> Automatic
 *                   Method -> Dropout
 *                   Output -> Automatic
 * Options:          OutputPorts -> {Output}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DropoutLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/DropoutLayer.html
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
fun dropoutLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DropoutLayer", arguments.toMutableList(), options)
}
