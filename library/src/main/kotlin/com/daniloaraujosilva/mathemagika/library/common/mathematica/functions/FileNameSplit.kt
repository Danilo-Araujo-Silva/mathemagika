package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileNameSplit
 *
 * Full name:        System`FileNameSplit
 *
 * Usage:            FileNameSplit["name"] splits a file name into a list of parts.
 *
 * Options:          OperatingSystem -> MacOSX
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FileNameSplit
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileNameSplit.html
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
fun fileNameSplit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileNameSplit", arguments.toMutableList(), options)
}
