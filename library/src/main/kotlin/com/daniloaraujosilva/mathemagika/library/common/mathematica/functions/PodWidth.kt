package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PodWidth
 *
 * Full name:        System`PodWidth
 *
 * Usage:            PodWidth is an option for WolframAlpha that determines the width parameters of the content returned by the Wolfram|Alpha API.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PodWidth
 * Documentation:    web: http://reference.wolfram.com/language/ref/PodWidth.html
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
fun podWidth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PodWidth", arguments.toMutableList(), options)
}
