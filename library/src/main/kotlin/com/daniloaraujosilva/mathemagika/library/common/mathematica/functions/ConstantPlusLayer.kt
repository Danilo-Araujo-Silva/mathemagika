package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConstantPlusLayer
 *
 * Full name:        System`ConstantPlusLayer
 *
 *                   ConstantPlusLayer[] represents a layer that adds a learnable bias to its input.
 * Usage:            ConstantPlusLayer[opts] includes options for initial bias and other parameters.
 *
 *                   Biases -> Automatic
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConstantPlusLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConstantPlusLayer.html
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
fun constantPlusLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConstantPlusLayer", arguments.toMutableList(), options)
}
