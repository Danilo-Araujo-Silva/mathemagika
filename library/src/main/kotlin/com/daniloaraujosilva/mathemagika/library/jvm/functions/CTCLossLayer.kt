package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CTCLossLayer
 *
 * Full name:        System`CTCLossLayer
 *
 * Usage:            CTCLossLayer[] represents a net layer that computes the connectionist temporal classification loss by comparing a sequence of class probability vectors with a sequence of indices representing the target classes.
 *
 *                   Input -> Automatic
 *                   Loss -> Automatic
 * Options:          Target -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CTCLossLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/CTCLossLayer.html
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
fun cTCLossLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CTCLossLayer", arguments.toMutableList(), options)
}
