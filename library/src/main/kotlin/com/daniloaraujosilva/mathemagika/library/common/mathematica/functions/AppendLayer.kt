package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AppendLayer
 *
 * Full name:        System`AppendLayer
 *
 * Usage:            AppendLayer[] represents a net layer that takes an input array and appends another array to it.
 *
 *                   Element -> Automatic
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AppendLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/AppendLayer.html
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
fun appendLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AppendLayer", arguments.toMutableList(), options)
}
