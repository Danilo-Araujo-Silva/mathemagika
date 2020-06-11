package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Quantile
 *
 * Full name:        System`Quantile
 *
 *                                                  th
 *                   Quantile[list, q] gives the q   quantile of list.
 *                   Quantile[list, {q , q , …}] gives a list of quantiles q , q , ….
 *                                    1   2                                 1   2
 *                   Quantile[list, q, {{a, b}, {c, d}}] uses the quantile definition specified by parameters a, b, c, d.
 * Usage:            Quantile[dist, q] gives a quantile of the distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Quantile
 * Documentation:    web: http://reference.wolfram.com/language/ref/Quantile.html
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
fun quantile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Quantile", arguments.toMutableList(), options)
}
