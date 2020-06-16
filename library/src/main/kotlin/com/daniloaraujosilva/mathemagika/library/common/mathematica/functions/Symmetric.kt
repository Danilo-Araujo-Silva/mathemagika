package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Symmetric
 *
 * Full name:        System`Symmetric
 *
 *                   Symmetric[{s , …, s }] represents the symmetry of a tensor that is symmetric in the slots s .
 * Usage:                        1      n                                                                       i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Symmetric
 * Documentation:    web: http://reference.wolfram.com/language/ref/Symmetric.html
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
fun symmetric(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Symmetric", arguments.toMutableList(), options)
}
