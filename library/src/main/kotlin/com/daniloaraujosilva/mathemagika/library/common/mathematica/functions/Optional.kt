package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Optional
 *
 * Full name:        System`Optional
 *
 * Usage:            patt : def or Optional[patt, def] is a pattern object that represents an expression of the form patt, which, if omitted, should be replaced by the default value def.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Optional
 * Documentation:    web: http://reference.wolfram.com/language/ref/Optional.html
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
fun optional(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Optional", arguments.toMutableList(), options)
}
