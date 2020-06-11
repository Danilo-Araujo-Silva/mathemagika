package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Exists
 *
 * Full name:        System`Exists
 *
 *                   Exists[x, expr] represents the statement that there exists a value of x for which expr is True.
 *                   Exists[x, cond, expr] states that there exists an x satisfying the condition cond for which expr is True.
 *                   Exists[{x , x , …}, expr] states that there exist values for all the x  for which expr is True.
 * Usage:                     1   2                                                        i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Exists
 * Documentation:    web: http://reference.wolfram.com/language/ref/Exists.html
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
fun exists(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Exists", arguments.toMutableList(), options)
}
