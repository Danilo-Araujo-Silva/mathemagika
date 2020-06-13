package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HeaderLines
 *
 * Full name:        System`HeaderLines
 *
 * Usage:            HeaderLines is an option for SemanticImport and related functions that specifies how many of the initial rows should be considered part of a column header.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeaderLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeaderLines.html
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
fun headerLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeaderLines", arguments.toMutableList(), options)
}
