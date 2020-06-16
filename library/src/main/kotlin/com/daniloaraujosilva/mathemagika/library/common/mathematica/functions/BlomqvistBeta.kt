package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlomqvistBeta
 *
 * Full name:        System`BlomqvistBeta
 *
 *                   BlomqvistBeta[v , v ] gives Blomqvist's medial correlation coefficient β for the vectors v  and v .
 *                                  1   2                                                                      1      2
 *                   BlomqvistBeta[m] gives Blomqvist's medial correlation coefficient β for the matrix m.
 *                   BlomqvistBeta[m , m ] gives Blomqvist's medial correlation coefficient β for the matrices m  and m .
 *                                  1   2                                                                       1      2
 *                   BlomqvistBeta[dist] gives the medial correlation coefficient matrix for the multivariate symbolic distribution dist.
 *                                                              th
 * Usage:            BlomqvistBeta[dist, i, j] gives the (i, j)   medial correlation coefficient for the multivariate symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlomqvistBeta
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlomqvistBeta.html
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
fun blomqvistBeta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlomqvistBeta", arguments.toMutableList(), options)
}
