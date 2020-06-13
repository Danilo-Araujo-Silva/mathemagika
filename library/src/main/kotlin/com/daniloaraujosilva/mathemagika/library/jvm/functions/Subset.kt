package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Subset
 *
 * Full name:        System`Subset
 *
 * Usage:            Subset[x, y, …] displays as x ⊂ y ⊂ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Subset
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subset.html
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
fun subset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subset", arguments.toMutableList(), options)
}
