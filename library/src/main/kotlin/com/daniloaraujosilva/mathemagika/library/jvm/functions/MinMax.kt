package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MinMax
 *
 * Full name:        System`MinMax
 *
 *                   MinMax[list] gives the list {Min[list], Max[list]}.
 *                   MinMax[list, δ] gives {Min[list] - δ, Max[list] + δ}.
 *                   MinMax[list, Scaled[s]] gives {Min[list] - δ, Max[list] + δ} where δ = s × (Max[list] - Min[list]).
 *                   MinMax[list, {δ   , δ   }] gives {Min[list] - δ   , Max[list] + δ   }.
 * Usage:                           min   max                       min               max
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MinMax
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinMax.html
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
fun minMax(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinMax", arguments.toMutableList(), options)
}
