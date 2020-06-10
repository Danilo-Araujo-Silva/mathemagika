package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MeanSquaredLossLayer
 * 
 * Full name:        System`MeanSquaredLossLayer
 * 
 * Usage:            MeanSquaredLossLayer[] represents a loss layer that computes the mean squared loss between its "Input" port and "Target" port.
 * 
 *                   Input -> Automatic
 *                   Loss -> Automatic
 * Options:          Target -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MeanSquaredLossLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanSquaredLossLayer.html
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
fun meanSquaredLossLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanSquaredLossLayer", arguments.toMutableList(), options)
}
