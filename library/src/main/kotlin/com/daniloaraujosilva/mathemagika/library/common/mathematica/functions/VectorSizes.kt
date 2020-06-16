package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VectorSizes
 *
 * Full name:        System`VectorSizes
 *
 * Usage:            VectorSizes is an option for VectorPlot and related functions that specifies the range of sizes used for arrows.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorSizes
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorSizes.html
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
fun vectorSizes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorSizes", arguments.toMutableList(), options)
}
