package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpanCharacterRounding
 *
 * Full name:        System`SpanCharacterRounding
 *
 * Usage:            SpanCharacterRounding is an option for selections that specifies the method used for rounding a spanning character when its size is to be adjusted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpanCharacterRounding
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanCharacterRounding.html
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
fun spanCharacterRounding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanCharacterRounding", arguments.toMutableList(), options)
}
