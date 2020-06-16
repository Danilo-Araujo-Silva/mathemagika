package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileExtension
 *
 * Full name:        System`FileExtension
 *
 * Usage:            FileExtension["file"] gives the file extension for a file name.
 *
 * Options:          OperatingSystem -> MacOSX
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FileExtension
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileExtension.html
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
fun fileExtension(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileExtension", arguments.toMutableList(), options)
}
