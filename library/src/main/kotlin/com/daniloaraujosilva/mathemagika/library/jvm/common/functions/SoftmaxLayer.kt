package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SoftmaxLayer
 *
 * Full name:        System`SoftmaxLayer
 *
 *                   SoftmaxLayer[] represents a softmax net layer.
 * Usage:            SoftmaxLayer[n] represents a softmax net layer that uses level n as the normalization dimension.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SoftmaxLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/SoftmaxLayer.html
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
fun softmaxLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SoftmaxLayer", arguments.toMutableList(), options)
}
