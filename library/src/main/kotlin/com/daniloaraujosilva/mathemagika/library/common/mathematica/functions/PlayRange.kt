package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PlayRange
 *
 * Full name:        System`PlayRange
 *
 * Usage:            PlayRange is an option for Play and related functions which specifies what range of sound amplitude levels should be included.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PlayRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlayRange.html
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
fun playRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlayRange", arguments.toMutableList(), options)
}
