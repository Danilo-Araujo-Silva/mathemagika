package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanAbsoluteLossLayer
 *
 * Full name:        System`MeanAbsoluteLossLayer
 *
 * Usage:            MeanAbsoluteLossLayer[] represents a loss layer that computes the mean absolute loss between the "Input" port and "Target" port.
 *
 *                   Input -> Automatic
 *                   Loss -> Automatic
 * Options:          Target -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeanAbsoluteLossLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanAbsoluteLossLayer.html
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
fun meanAbsoluteLossLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanAbsoluteLossLayer", arguments.toMutableList(), options)
}
