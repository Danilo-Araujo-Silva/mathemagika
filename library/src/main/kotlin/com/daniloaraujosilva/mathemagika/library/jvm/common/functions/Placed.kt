package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Placed
 *
 * Full name:        System`Placed
 *
 *                   Placed[expr, pos] represents an expression expr placed at relative position pos in a chart or other display.
 *                   Placed[{e , e , …}, pos] places each of the e  at a relative position specified by pos.
 *                            1   2                               i
 *                   Placed[{e , e , …}, pos, f] applies the function f to each of the e  before displaying it.
 * Usage:                     1   2                                                     i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Placed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Placed.html
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
fun placed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Placed", arguments.toMutableList(), options)
}
