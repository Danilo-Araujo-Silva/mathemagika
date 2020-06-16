package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TagUnset
 *
 * Full name:        System`TagUnset
 *
 * Usage:            f/:lhs=. removes any rules defined for lhs, associated with the symbol f.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TagUnset
 * Documentation:    web: http://reference.wolfram.com/language/ref/TagUnset.html
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
fun tagUnset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TagUnset", arguments.toMutableList(), options)
}
