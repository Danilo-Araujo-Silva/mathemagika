package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OwnValues
 *
 * Full name:        System`OwnValues
 *
 * Usage:            OwnValues[x] gives the rule corresponding to any ownvalue defined for the symbol x.
 *
 * Options:          Sort -> True
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OwnValues
 * Documentation:    web: http://reference.wolfram.com/language/ref/OwnValues.html
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
fun ownValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OwnValues", arguments.toMutableList(), options)
}
