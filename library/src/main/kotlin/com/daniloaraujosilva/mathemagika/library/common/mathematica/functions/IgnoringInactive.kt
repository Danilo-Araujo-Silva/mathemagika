package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IgnoringInactive
 *
 * Full name:        System`IgnoringInactive
 *
 * Usage:            IgnoringInactive[patt] is a pattern object that, for purposes of pattern matching, ignores occurrences of Inactive in both patt and the expression being matched.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IgnoringInactive
 * Documentation:    web: http://reference.wolfram.com/language/ref/IgnoringInactive.html
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
fun ignoringInactive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IgnoringInactive", arguments.toMutableList(), options)
}
