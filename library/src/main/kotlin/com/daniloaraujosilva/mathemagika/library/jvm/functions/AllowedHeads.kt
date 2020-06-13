package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AllowedHeads
 *
 * Full name:        System`AllowedHeads
 *
 * Usage:            AllowedHeads is an option that specifies the heads of subexpressions into which a function may descend.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AllowedHeads
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowedHeads.html
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
fun allowedHeads(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowedHeads", arguments.toMutableList(), options)
}
