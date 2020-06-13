package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StringPadRight
 *
 * Full name:        System`StringPadRight
 *
 *                   StringPadRight["string", n] makes string be of length n, padding it on the right with spaces or truncating it if necessary.
 *                   StringPadRight["string", n, "padding"] pads by repeating copies of the string padding.
 *                   StringPadRight[{s , s , …}] pads strings with spaces on the right to make them all the same length.
 *                                    1   2
 *                   StringPadRight[{s , s , …}, n, …] pads or truncates to make all strings of length n.
 * Usage:                             1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StringPadRight
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringPadRight.html
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
fun stringPadRight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringPadRight", arguments.toMutableList(), options)
}
