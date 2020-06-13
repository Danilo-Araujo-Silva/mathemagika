package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RawBoxes
 *
 * Full name:        System`RawBoxes
 *
 * Usage:            RawBoxes[boxes] is a low-level construct which is formatted as boxes without further interpretation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RawBoxes
 * Documentation:    web: http://reference.wolfram.com/language/ref/RawBoxes.html
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
fun rawBoxes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RawBoxes", arguments.toMutableList(), options)
}
