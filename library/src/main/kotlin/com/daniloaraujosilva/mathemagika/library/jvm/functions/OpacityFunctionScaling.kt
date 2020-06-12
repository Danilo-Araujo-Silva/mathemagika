package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OpacityFunctionScaling
 *
 * Full name:        System`OpacityFunctionScaling
 *
 * Usage:            OpacityFunctionScaling is an option to visualization functions such as DensityPlot3D that specifies whether arguments supplied to OpacityFunction should be scaled to lie between 0 and 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OpacityFunctionScaling
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpacityFunctionScaling.html
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
fun opacityFunctionScaling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpacityFunctionScaling", arguments.toMutableList(), options)
}
