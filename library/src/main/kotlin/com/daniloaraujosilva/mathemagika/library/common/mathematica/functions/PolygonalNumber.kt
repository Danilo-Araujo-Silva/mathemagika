package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PolygonalNumber
 *
 * Full name:        System`PolygonalNumber
 *
 *                                                  th
 *                   PolygonalNumber[n] gives the n   triangular number T .
 *                                                                        n
 *                                                     th                  r
 *                   PolygonalNumber[r, n] gives the n   r-gonal number P  .
 * Usage:                                                                 n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolygonalNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolygonalNumber.html
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
fun polygonalNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolygonalNumber", arguments.toMutableList(), options)
}
