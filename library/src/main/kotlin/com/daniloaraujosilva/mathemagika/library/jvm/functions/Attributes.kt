package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Attributes
 *
 * Full name:        System`Attributes
 *
 * Usage:            Attributes[symbol] gives the list of attributes for a symbol.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Attributes
 * Documentation:    web: http://reference.wolfram.com/language/ref/Attributes.html
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
fun attributes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Attributes", arguments.toMutableList(), options)
}
