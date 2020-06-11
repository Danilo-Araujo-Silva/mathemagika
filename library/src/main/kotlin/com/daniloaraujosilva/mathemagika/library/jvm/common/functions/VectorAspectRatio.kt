package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VectorAspectRatio
 *
 * Full name:        System`VectorAspectRatio
 *
 * Usage:            VectorAspectRatio is an option setting for VectorPlot and related functions that determines the relative width and length of the arrow markers in the plot.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorAspectRatio
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorAspectRatio.html
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
fun vectorAspectRatio(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorAspectRatio", arguments.toMutableList(), options)
}
