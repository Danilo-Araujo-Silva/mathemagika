package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FilledCurveBoxOptions
 *
 * Full name:        System`FilledCurveBoxOptions
 *
 *                   FilledCurveBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for FilledCurveBox objects.
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
fun filledCurveBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FilledCurveBoxOptions", arguments.toMutableList(), options)
}
