package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MixedRadix
 *
 * Full name:        System`MixedRadix
 *
 *                   MixedRadix[{b , …, b }] represents the list of bases of a numerical system in which different digits have different bases.
 * Usage:                         1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MixedRadix
 * Documentation:    web: http://reference.wolfram.com/language/ref/MixedRadix.html
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
fun mixedRadix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MixedRadix", arguments.toMutableList(), options)
}
