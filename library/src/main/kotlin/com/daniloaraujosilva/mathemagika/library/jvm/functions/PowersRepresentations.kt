package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PowersRepresentations
 *
 * Full name:        System`PowersRepresentations
 *
 *                                                                                                                                   th
 * Usage:            PowersRepresentations[n, k, p] gives the distinct representations of the integer n as a sum of k non-negative p   integer powers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PowersRepresentations
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowersRepresentations.html
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
fun powersRepresentations(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowersRepresentations", arguments.toMutableList(), options)
}
