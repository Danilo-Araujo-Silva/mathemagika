package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             JoinedCurveBoxOptions
 *
 * Full name:        System`JoinedCurveBoxOptions
 *
 *                   JoinedCurveBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for JoinedCurveBox objects.
 * Usage:                                        1      1     2      2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun joinedCurveBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JoinedCurveBoxOptions", arguments.toMutableList(), options)
}
