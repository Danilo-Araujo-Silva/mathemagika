package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NHoldAll
 *
 * Full name:        System`NHoldAll
 *
 * Usage:            NHoldAll is an attribute which specifies that none of the arguments to a function should be affected by N.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NHoldAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/NHoldAll.html
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
fun nHoldAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NHoldAll", arguments.toMutableList(), options)
}
