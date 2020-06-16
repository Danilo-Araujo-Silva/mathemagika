package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExcludedLines
 *
 * Full name:        System`ExcludedLines
 *
 * Usage:            ExcludedLines is an option for SemanticImport and related functions that specifies which lines should be ignored for further processing.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExcludedLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExcludedLines.html
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
fun excludedLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExcludedLines", arguments.toMutableList(), options)
}
