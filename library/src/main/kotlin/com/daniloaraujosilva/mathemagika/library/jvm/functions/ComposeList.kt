package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ComposeList
 *
 * Full name:        System`ComposeList
 *
 *                   ComposeList[{f , f , …}, x] generates a list of the form {x, f [x], f [f [x]], …}.
 * Usage:                          1   2                                           1      2  1
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ComposeList
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComposeList.html
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
fun composeList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComposeList", arguments.toMutableList(), options)
}
