package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Multicolumn
 *
 * Full name:        System`Multicolumn
 *
 *                   Multicolumn[list, cols] is an object that formats with the elements of list arranged in a grid with the indicated number of columns.
 *                   Multicolumn[list, {rows, Automatic}] formats as a grid with the indicated number of rows.
 *                   Multicolumn[list, {rows, cols}] formats as a grid with the indicated number of rows and columns.
 * Usage:            Multicolumn[list] formats with the elements of list in a roughly square arrangement.
 *
 * Options:          None
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Multicolumn
 * Documentation:    web: http://reference.wolfram.com/language/ref/Multicolumn.html
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
 * Default value:    Options[Multicolumn] := Options[Multicolumn] = Sort[Flatten[{DeleteCases[Options[Grid], _[Alignment, _]], Alignment -> {Left, Baseline}, Appearance -> Automatic}]]
 *
 * Numeric values:   None
 */
fun multicolumn(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Multicolumn", arguments.toMutableList(), options)
}
