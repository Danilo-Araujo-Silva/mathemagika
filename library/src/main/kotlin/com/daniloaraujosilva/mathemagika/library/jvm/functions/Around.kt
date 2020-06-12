package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Around
 *
 * Full name:        System`Around
 *
 *                   Around[x, δ] represents an approximate number or quantity with a value around x and an uncertainty δ.
 *                   Around[x, {δ , δ }] represents a number or quantity with a value around x and asymmetric uncertainties δ , δ .
 *                               -   +                                                                                       -   +
 *                   Around[dist] gives an approximate number or quantity around the mean of the distribution dist, with an uncertainty corresponding to the standard deviation of the distribution.
 *                   Around[list] gives an approximate object around the mean of the elements of list and with an uncertainty corresponding to their standard deviation.
 * Usage:            Around[s] gives an approximate object derived from the number, interval or string specification s.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Around
 * Documentation:    web: http://reference.wolfram.com/language/ref/Around.html
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
fun around(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Around", arguments.toMutableList(), options)
}
