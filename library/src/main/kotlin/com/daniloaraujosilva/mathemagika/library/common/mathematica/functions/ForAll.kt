package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ForAll
 *
 * Full name:        System`ForAll
 *
 *                   ForAll[x, expr] represents the statement that expr is True for all values of x.
 *                   ForAll[x, cond, expr] states that expr is True for all x satisfying the condition cond.
 *                   ForAll[{x , x , …}, expr] states that expr is True for all values of all the x .
 * Usage:                     1   2                                                                i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ForAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/ForAll.html
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
fun forAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ForAll", arguments.toMutableList(), options)
}
