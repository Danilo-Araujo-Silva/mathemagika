package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Overlaps
 *
 * Full name:        System`Overlaps
 *
 * Usage:            Overlaps is an option to string and sequence functions that specifies how to treat overlapping substrings.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Overlaps
 * Documentation:    web: http://reference.wolfram.com/language/ref/Overlaps.html
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
fun overlaps(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Overlaps", arguments.toMutableList(), options)
}
