package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StringDelete
 *
 * Full name:        System`StringDelete
 *
 *                   StringDelete["string", patt] yields the string obtained by deleting from string all occurrences of anything matching the string pattern patt.
 * Usage:            StringDelete[patt] represents an operator form of StringDelete that can be applied to an expression.
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringDelete.html
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
fun stringDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringDelete", arguments.toMutableList(), options)
}
