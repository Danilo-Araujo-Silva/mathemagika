package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExportAutoReplacements
 *
 * Full name:        System`ExportAutoReplacements
 *
 * Usage:            ExportAutoReplacements is an option for cells that specifies which replacement rules the Wolfram Language automatically applies when exporting text.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExportAutoReplacements
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExportAutoReplacements.html
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
fun exportAutoReplacements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExportAutoReplacements", arguments.toMutableList(), options)
}
