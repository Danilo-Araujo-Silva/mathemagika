package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SixJSymbol
 *
 * Full name:        System`SixJSymbol
 *
 *                   SixJSymbol[{j , j , j }, {j , j , j }] gives the values of the Racah 6‐j symbol.
 * Usage:                         1   2   3     4   5   6
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SixJSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/SixJSymbol.html
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
fun sixJSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SixJSymbol", arguments.toMutableList(), options)
}
