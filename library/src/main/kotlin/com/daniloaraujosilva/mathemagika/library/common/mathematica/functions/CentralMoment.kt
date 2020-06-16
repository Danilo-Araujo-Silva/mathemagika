package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CentralMoment
 *
 * Full name:        System`CentralMoment
 *
 *                                                      th
 *                   CentralMoment[list, r] gives the r   central moment of the elements in list with respect to their mean.
 *                                                      th
 *                   CentralMoment[dist, r] gives the r   central moment of the distribution dist.
 *                                                     th
 * Usage:            CentralMoment[r] represents the r   formal central moment.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CentralMoment
 * Documentation:    web: http://reference.wolfram.com/language/ref/CentralMoment.html
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
fun centralMoment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CentralMoment", arguments.toMutableList(), options)
}
