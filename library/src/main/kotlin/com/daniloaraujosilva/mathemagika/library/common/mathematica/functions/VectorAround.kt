package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VectorAround
 *
 * Full name:        System`VectorAround
 *
 *                   VectorAround[{x , x , …}, {δ , δ , …}] represents a vector of uncorrelated approximate numbers or quantities with values x  and uncertainties δ .
 *                                  1   2        1   2                                                                                         i                    i
 *                   VectorAround[{x , x , …}, {{Δ  , Δ  , …}, {Δ  , Δ  , …}, …}] represents a vector of approximate numbers or quantities with values x  and covariance matrix Δ.
 *                                  1   2         11   12        12   22                                                                                i
 *                   VectorAround[{x , x }, {{δ , δ }, ρ}] represents a pair of approximate numbers or quantities with uncertainties δ , δ  and correlation factor ρ.
 *                                  1   2      1   2                                                                                  1   2
 *                   VectorAround[{x , x , …}, {{δ , δ , …}, {{1, R  , …}, {R  , 1, …}, …}}] represents a vector of approximate numbers or quantities with uncertainties δ  and correlation matrix R.
 * Usage:                           1   2         1   2            12        12                                                                                           i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorAround
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorAround.html
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
fun vectorAround(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorAround", arguments.toMutableList(), options)
}
