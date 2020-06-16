package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PDF
 *
 * Full name:        System`PDF
 *
 *                   PDF[dist, x] gives the probability density function for the distribution dist evaluated at x.
 *                   PDF[dist, {x , x , …}] gives the multivariate probability density function for a distribution dist evaluated at {x , x , …}.
 *                               1   2                                                                                                 1   2
 * Usage:            PDF[dist] gives the PDF as a pure function.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PDF
 * Documentation:    web: http://reference.wolfram.com/language/ref/PDF.html
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
fun pDF(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PDF", arguments.toMutableList(), options)
}
