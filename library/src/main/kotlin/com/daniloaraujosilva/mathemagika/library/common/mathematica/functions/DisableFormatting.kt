package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DisableFormatting
 *
 * Full name:        System`DisableFormatting
 *
 * Usage:            DisableFormatting[expr] is a form that disables the formatting of expr when it appears inside held expressions, but gives expr as soon as evaluation occurs.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DisableFormatting
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisableFormatting.html
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
fun disableFormatting(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisableFormatting", arguments.toMutableList(), options)
}
