package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UnionPlus
 *
 * Full name:        System`UnionPlus
 *
 * Usage:            UnionPlus[x, y, …] displays as x ⊎ y ⊎ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UnionPlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnionPlus.html
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
fun unionPlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnionPlus", arguments.toMutableList(), options)
}
