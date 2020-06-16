package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Remove
 *
 * Full name:        System`Remove
 *
 *                   Remove[symbol , …] removes symbols completely, so that their names are no longer recognized by the Wolfram Language.
 *                                1
 *                   Remove["form ", "form ", …] removes all symbols whose names match any of the string patterns form .
 * Usage:                        1        2                                                                           i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Locked
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Remove
 * Documentation:    web: http://reference.wolfram.com/language/ref/Remove.html
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
fun remove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Remove", arguments.toMutableList(), options)
}
