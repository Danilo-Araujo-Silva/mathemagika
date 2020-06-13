package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Translate
 *
 * Full name:        System`Translate
 *
 *                   Translate[g, {x, y, …}] represents graphics primitives g translated by the vector {x, y, …}.
 *                   Translate[g, {{x , y , …}, {x , y , …}, …}] represents multiple copies of g translated by a collection of vectors.
 * Usage:                            1   1        2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Translate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Translate.html
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
fun translate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Translate", arguments.toMutableList(), options)
}
