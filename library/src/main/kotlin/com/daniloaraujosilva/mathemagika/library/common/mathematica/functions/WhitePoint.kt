package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WhitePoint
 *
 * Full name:        System`WhitePoint
 *
 * Usage:            WhitePoint is an option for ChromaticityPlot and other functions to specify what white point to show.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WhitePoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/WhitePoint.html
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
fun whitePoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WhitePoint", arguments.toMutableList(), options)
}
