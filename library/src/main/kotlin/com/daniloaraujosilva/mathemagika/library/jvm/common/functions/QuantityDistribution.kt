package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityDistribution
 *
 * Full name:        System`QuantityDistribution
 *
 *                   QuantityDistribution[dist, unit] represents a distribution dist of quantities with unit specified by unit.
 *                   QuantityDistribution[dist, {unit , unit , …}] represents a multivariate distribution with units {unit , unit , …}.
 * Usage:                                            1      2                                                             1      2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityDistribution.html
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
fun quantityDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityDistribution", arguments.toMutableList(), options)
}
