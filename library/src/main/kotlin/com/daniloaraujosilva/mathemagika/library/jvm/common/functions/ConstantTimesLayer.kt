package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConstantTimesLayer
 *
 * Full name:        System`ConstantTimesLayer
 *
 *                   ConstantTimesLayer[] represents a layer that multiplies its input by a learnable scaling array.
 * Usage:            ConstantTimesLayer[opts] includes options for initial scaling and other parameters.
 *
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 * Options:          Scaling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConstantTimesLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConstantTimesLayer.html
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
fun constantTimesLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConstantTimesLayer", arguments.toMutableList(), options)
}
