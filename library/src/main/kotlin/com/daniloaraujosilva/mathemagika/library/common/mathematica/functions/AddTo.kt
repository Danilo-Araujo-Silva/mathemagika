package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AddTo
 *
 * Full name:        System`AddTo
 *
 * Usage:            x += dx adds dx to x and returns the new value of x.
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AddTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/AddTo.html
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
fun addTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AddTo", arguments.toMutableList(), options)
}
