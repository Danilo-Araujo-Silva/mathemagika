package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CantorStaircase
 *
 * Full name:        System`CantorStaircase
 *
 *                   CantorStaircase[x] gives the Cantor staircase function F (x).
 * Usage:                                                                    C
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CantorStaircase
 * Documentation:    web: http://reference.wolfram.com/language/ref/CantorStaircase.html
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
fun cantorStaircase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CantorStaircase", arguments.toMutableList(), options)
}
