package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindDistribution
 *
 * Full name:        System`FindDistribution
 *
 *                   FindDistribution[data] finds a simple functional form to fit the distribution of data.
 *                   FindDistribution[data, n] finds up to n best distributions.
 *                   FindDistribution[data, n, prop] returns up to n best distributions associated with property prop.
 *                   FindDistribution[data, n, {prop , prop , …}] returns up to n best distributions associated with properties prop , prop , etc.
 * Usage:                                           1      2                                                                        1      2
 *
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   TargetFunctions -> Automatic
 *                   MaxItems -> Infinity
 * Options:          RandomSeeding -> 1234
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindDistribution.html
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
fun findDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindDistribution", arguments.toMutableList(), options)
}
