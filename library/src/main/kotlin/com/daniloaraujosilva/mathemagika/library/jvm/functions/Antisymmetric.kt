package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Antisymmetric
 *
 * Full name:        System`Antisymmetric
 *
 *                   Antisymmetric[{s , …, s }] represents the symmetry of a tensor that is antisymmetric in the slots s .
 * Usage:                            1      n                                                                           i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Antisymmetric
 * Documentation:    web: http://reference.wolfram.com/language/ref/Antisymmetric.html
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
fun antisymmetric(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Antisymmetric", arguments.toMutableList(), options)
}
