package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StandbyDistribution
 *
 * Full name:        System`StandbyDistribution
 *
 *                   StandbyDistribution[dist , {dist , …, dist }] represents a standby distribution with component lifetime distributions dist . When component i fails, component i + 1 will become active.
 *                                           1       2         n                                                                               i
 *                   StandbyDistribution[dist , {dist , …, dist }, p] represents a standby distribution where switching from component i to component i + 1 succeeds with probability p.
 *                                           1       2         n
 *                   StandbyDistribution[dist , {dist , …, dist }, sdist] represents a standby distribution where the switch component has lifetime distribution sdist.
 *                                           1       2         n
 *                                                                                                                                         th
 *                   StandbyDistribution[dist , {…, {dist           , dist         }, …}, …] represents a standby distribution where the i   component lifetime distribution follows dist            in inactive mode and dist          in active mode.
 * Usage:                                    1           i, inactive      i, active                                                                                                       i, inactive                          i, active
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StandbyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/StandbyDistribution.html
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
fun standbyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StandbyDistribution", arguments.toMutableList(), options)
}
