package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SkellamDistribution
 *
 * Full name:        System`SkellamDistribution
 *
 *                   SkellamDistribution[μ , μ ] represents a Skellam distribution with shape parameters μ  and μ .
 * Usage:                                 1   2                                                           1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SkellamDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SkellamDistribution.html
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
fun skellamDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SkellamDistribution", arguments.toMutableList(), options)
}
