package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrobeniusNumber
 *
 * Full name:        System`FrobeniusNumber
 *
 *                   FrobeniusNumber[{a , …, a }] gives the Frobenius number of a , …, a .
 * Usage:                              1      n                                  1      n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrobeniusNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrobeniusNumber.html
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
fun frobeniusNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrobeniusNumber", arguments.toMutableList(), options)
}
