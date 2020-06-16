package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Stub
 *
 * Full name:        System`Stub
 *
 * Usage:            Stub is an attribute which specifies that if a symbol is ever used, Needs should automatically be called on the context of the symbol.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Stub
 * Documentation:    web: http://reference.wolfram.com/language/ref/Stub.html
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
fun stub(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Stub", arguments.toMutableList(), options)
}
