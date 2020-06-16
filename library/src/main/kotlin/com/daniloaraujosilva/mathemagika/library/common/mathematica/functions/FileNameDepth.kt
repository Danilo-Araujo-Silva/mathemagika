package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileNameDepth
 *
 * Full name:        System`FileNameDepth
 *
 * Usage:            FileNameDepth["name"] gives the number of path elements in the file name "file".
 *
 * Options:          OperatingSystem -> MacOSX
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FileNameDepth
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileNameDepth.html
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
fun fileNameDepth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileNameDepth", arguments.toMutableList(), options)
}
