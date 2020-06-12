package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityArray
 *
 * Full name:        System`QuantityArray
 *
 *                   QuantityArray[mags, unit] represents an array of quantities with magnitudes mags and common unit.
 *                   QuantityArray[mags, {unit , unit , …}] represents an array of lists of quantities with units {unit , unit , …}.
 *                                            1      2                                                                 1      2
 * Usage:            QuantityArray[quants] converts an array of Quantity objects into a single QuantityArray object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityArray.html
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
fun quantityArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityArray", arguments.toMutableList(), options)
}
