package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $NewSymbol
 *
 * Full name:        System`$NewSymbol
 *
 * Usage:            $NewSymbol is a global variable which, if set, is applied to the name and context of each new symbol that the Wolfram Language creates.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/$NewSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/$NewSymbol.html
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
fun `$NewSymbol`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$NewSymbol", arguments.toMutableList(), options)
}
