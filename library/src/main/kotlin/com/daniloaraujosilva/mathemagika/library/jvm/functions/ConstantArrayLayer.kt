package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConstantArrayLayer
 *
 * Full name:        System`ConstantArrayLayer
 *
 *                   ConstantArrayLayer[] represents a layer that has no input and produces as output a constant array.
 * Usage:            ConstantArrayLayer[opts] includes options for initial value of the array or output size.
 *
 *                   Array -> Automatic
 *                   LearningRateMultipliers -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConstantArrayLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConstantArrayLayer.html
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
fun constantArrayLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConstantArrayLayer", arguments.toMutableList(), options)
}
