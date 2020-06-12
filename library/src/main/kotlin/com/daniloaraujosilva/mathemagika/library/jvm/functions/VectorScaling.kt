package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VectorScaling
 *
 * Full name:        System`VectorScaling
 *
 * Usage:            VectorScaling is an option for VectorPlot and related functions that determines how the magnitudes of vectors are scaled for visualization.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorScaling
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorScaling.html
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
fun vectorScaling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorScaling", arguments.toMutableList(), options)
}
