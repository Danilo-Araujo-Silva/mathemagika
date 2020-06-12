package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FileDate
 *
 * Full name:        System`FileDate
 *
 *                   FileDate["file"] gives the date and time at which a file was last modified.
 * Usage:            FileDate["file", "type"] gives information on the specified type of date associated with a file.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileDate.html
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
fun fileDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileDate", arguments.toMutableList(), options)
}
