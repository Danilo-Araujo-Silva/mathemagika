package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MixedRadixQuantity
 *
 * Full name:        System`MixedRadixQuantity
 *
 *                   MixedRadixQuantity[{value , …, value }, {unit , …, unit }] represents a single Quantity expressed using an additive sequence of compatible units with magnitude values.
 * Usage:                                     1          n        1         n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MixedRadixQuantity
 * Documentation:    web: http://reference.wolfram.com/language/ref/MixedRadixQuantity.html
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
fun mixedRadixQuantity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MixedRadixQuantity", arguments.toMutableList(), options)
}
