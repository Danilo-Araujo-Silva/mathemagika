package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Text
 *
 * Full name:        System`Text
 *
 *                   Text[expr] displays with expr in plain text format.
 * Usage:            Text[expr, coords] is a graphics primitive that displays the textual form of expr centered at the point specified by coords.
 *
 *                   Background -> None
 *                   BaseStyle -> {}
 *                   ContentSelectable -> Automatic
 * Options:          FormatType :> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Text
 * Documentation:    web: http://reference.wolfram.com/language/ref/Text.html
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
fun text(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Text", arguments.toMutableList(), options)
}
