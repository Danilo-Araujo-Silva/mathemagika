package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Row
 *
 * Full name:        System`Row
 *
 *                   Row[{expr , expr , …}] is an object that formats with the expr  arranged in a row, potentially extending over several lines.
 *                            1      2                                             i
 * Usage:            Row[list, s] inserts s as a separator between successive elements.
 *
 *                   Alignment -> {Left, Baseline}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> Row
 *                   Editable -> Automatic
 *                   Frame -> None
 *                   FrameMargins -> Automatic
 *                   FrameStyle -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   RoundingRadius -> 0
 *                   Selectable -> Automatic
 *                   StripOnInput -> False
 * Options:          SyntaxForm -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Row
 * Documentation:    web: http://reference.wolfram.com/language/ref/Row.html
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
fun row(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Row", arguments.toMutableList(), options)
}
