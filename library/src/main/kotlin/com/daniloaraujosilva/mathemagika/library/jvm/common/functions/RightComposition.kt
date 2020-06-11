package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightComposition
 *
 * Full name:        System`RightComposition
 *
 *                   RightComposition[f , f , f , …] represents a composition on the right of the functions f , f , f , ….
 * Usage:                              1   2   3                                                             1   2   3
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RightComposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightComposition.html
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
fun rightComposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightComposition", arguments.toMutableList(), options)
}
