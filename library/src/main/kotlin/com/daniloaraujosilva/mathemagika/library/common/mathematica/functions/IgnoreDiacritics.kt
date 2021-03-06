package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IgnoreDiacritics
 *
 * Full name:        System`IgnoreDiacritics
 *
 * Usage:            IgnoreDiacritics is an option for string, grammar, and related functions that specifies whether diacritics should be ignored in strings.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IgnoreDiacritics
 * Documentation:    web: http://reference.wolfram.com/language/ref/IgnoreDiacritics.html
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
fun ignoreDiacritics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IgnoreDiacritics", arguments.toMutableList(), options)
}
