package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HotellingTSquareDistribution
 *
 * Full name:        System`HotellingTSquareDistribution
 *
 *                                                                              2
 * Usage:            HotellingTSquareDistribution[p, m] represents Hotelling's T  distribution with dimensionality parameter p and m degrees of freedom.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HotellingTSquareDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HotellingTSquareDistribution.html
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
fun hotellingTSquareDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HotellingTSquareDistribution", arguments.toMutableList(), options)
}
