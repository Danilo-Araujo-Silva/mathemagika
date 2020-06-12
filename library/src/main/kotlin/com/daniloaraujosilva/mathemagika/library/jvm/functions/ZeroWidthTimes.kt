package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ZeroWidthTimes
 *
 * Full name:        System`ZeroWidthTimes
 *
 * Usage:            ZeroWidthTimes is an option for selections that specifies whether blank spaces representing multiplication are explicitly shown.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ZeroWidthTimes
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZeroWidthTimes.html
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
fun zeroWidthTimes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZeroWidthTimes", arguments.toMutableList(), options)
}
