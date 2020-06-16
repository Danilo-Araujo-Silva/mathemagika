package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HaradaNortonGroupHN
 *
 * Full name:        System`HaradaNortonGroupHN
 *
 * Usage:            HaradaNortonGroupHN[] represents the sporadic simple Harada–Norton group HN.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HaradaNortonGroupHN
 * Documentation:    web: http://reference.wolfram.com/language/ref/HaradaNortonGroupHN.html
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
fun haradaNortonGroupHN(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HaradaNortonGroupHN", arguments.toMutableList(), options)
}
