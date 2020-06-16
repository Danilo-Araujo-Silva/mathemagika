package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FlattenLayer
 *
 * Full name:        System`FlattenLayer
 *
 *                   FlattenLayer[] represents a net layer that flattens any input array into a vector.
 * Usage:            FlattenLayer[n] represents a net layer that flattens its input to level n.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FlattenLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/FlattenLayer.html
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
fun flattenLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FlattenLayer", arguments.toMutableList(), options)
}
