package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ThreeJSymbol
 *
 * Full name:        System`ThreeJSymbol
 *
 *                   ThreeJSymbol[{j , m }, {j , m }, {j , m }] gives the values of the Wigner 3‐j symbol.
 * Usage:                           1   1     2   2     3   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ThreeJSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/ThreeJSymbol.html
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
fun threeJSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ThreeJSymbol", arguments.toMutableList(), options)
}
