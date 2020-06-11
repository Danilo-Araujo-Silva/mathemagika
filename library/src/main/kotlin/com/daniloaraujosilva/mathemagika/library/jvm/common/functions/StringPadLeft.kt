package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringPadLeft
 *
 * Full name:        System`StringPadLeft
 *
 *                   StringPadLeft["string", n] makes string be of length n, padding it on the left with spaces or truncating it if necessary.
 *                   StringPadLeft["string", n, "padding"] pads by repeating copies of the string padding.
 *                   StringPadLeft[{s , s , …}] pads strings with spaces on the left to make them all the same length.
 *                                   1   2
 *                   StringPadLeft[{s , s , …}, n, …] pads or truncates to make all strings of length n.
 * Usage:                            1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StringPadLeft
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringPadLeft.html
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
fun stringPadLeft(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringPadLeft", arguments.toMutableList(), options)
}
