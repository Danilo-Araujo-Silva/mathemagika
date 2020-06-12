package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DigitBlock
 *
 * Full name:        System`DigitBlock
 *
 * Usage:            DigitBlock is an option for NumberForm and related functions that specifies the maximum length of blocks of digits between breaks.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DigitBlock
 * Documentation:    web: http://reference.wolfram.com/language/ref/DigitBlock.html
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
fun digitBlock(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DigitBlock", arguments.toMutableList(), options)
}
