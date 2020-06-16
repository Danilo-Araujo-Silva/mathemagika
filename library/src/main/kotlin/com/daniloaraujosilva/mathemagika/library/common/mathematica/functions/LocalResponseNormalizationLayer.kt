package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LocalResponseNormalizationLayer
 *
 * Full name:        System`LocalResponseNormalizationLayer
 *
 * Usage:            LocalResponseNormalizationLayer[] represents a net layer that normalizes its input by averaging across neighboring input channels.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalResponseNormalizationLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalResponseNormalizationLayer.html
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
fun localResponseNormalizationLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalResponseNormalizationLayer", arguments.toMutableList(), options)
}
