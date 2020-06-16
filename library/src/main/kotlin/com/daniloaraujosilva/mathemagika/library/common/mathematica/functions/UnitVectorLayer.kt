package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UnitVectorLayer
 *
 * Full name:        System`UnitVectorLayer
 *
 *                   UnitVectorLayer[n] represents a net layer that transforms integers between 1 and n into n-dimensional unit vectors.
 * Usage:            UnitVectorLayer[] leaves the n to be inferred from context.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnitVectorLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitVectorLayer.html
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
fun unitVectorLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitVectorLayer", arguments.toMutableList(), options)
}
