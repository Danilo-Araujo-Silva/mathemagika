package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LayerSizeFunction
 *
 * Full name:        System`LayerSizeFunction
 *
 * Usage:            LayerSizeFunction is an option for TreePlot that gives a function to specify the relative height to allow for each layer.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LayerSizeFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/LayerSizeFunction.html
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
fun layerSizeFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LayerSizeFunction", arguments.toMutableList(), options)
}
