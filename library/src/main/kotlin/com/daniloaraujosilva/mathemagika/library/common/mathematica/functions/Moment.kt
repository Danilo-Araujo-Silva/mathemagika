package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Moment
 *
 * Full name:        System`Moment
 *
 *                                               th
 *                   Moment[list, r] gives the r   sample moment of the elements in list.
 *                                               th
 *                   Moment[dist, r] gives the r   moment of the distribution dist.
 *                                                                th
 *                   Moment[…, {r , r , …}] gives the {r , r , …}   multivariate moment.
 *                               1   2                  1   2
 *                                              th
 * Usage:            Moment[r] represents the r   formal moment.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Moment
 * Documentation:    web: http://reference.wolfram.com/language/ref/Moment.html
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
fun moment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Moment", arguments.toMutableList(), options)
}
