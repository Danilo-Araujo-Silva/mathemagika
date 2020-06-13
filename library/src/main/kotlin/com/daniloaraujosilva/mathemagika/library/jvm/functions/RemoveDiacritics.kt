package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveDiacritics
 *
 * Full name:        System`RemoveDiacritics
 *
 * Usage:            RemoveDiacritics[string] replaces characters in string that have diacritics by their base ASCII characters, when possible.
 *
 * Options:          Language :> $Language
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveDiacritics
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveDiacritics.html
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
fun removeDiacritics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveDiacritics", arguments.toMutableList(), options)
}
