package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DirectoryName
 *
 * Full name:        System`DirectoryName
 *
 * Usage:            DirectoryName["name"] extracts the directory name from the specification for a file.
 *
 * Options:          OperatingSystem -> MacOSX
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DirectoryName
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirectoryName.html
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
fun directoryName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirectoryName", arguments.toMutableList(), options)
}
