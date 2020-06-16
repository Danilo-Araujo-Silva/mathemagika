package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HeaderSize
 *
 * Full name:        System`HeaderSize
 *
 * Usage:            HeaderSize is an option for Dataset that specifies the widths and heights of headers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeaderSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeaderSize.html
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
fun headerSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeaderSize", arguments.toMutableList(), options)
}
