package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             OpenRead
 *
 * Full name:        System`OpenRead
 *
 * Usage:            OpenRead["file"] opens a file to read data from, and returns an InputStream object.
 *
 *                   AppendCheck -> False
 *                   BinaryFormat -> False
 *                   DOSTextFormat -> True
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OpenRead
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpenRead.html
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
fun openRead(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpenRead", arguments.toMutableList(), options)
}
