package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ProgressIndicatorBoxOptions
 *
 * Full name:        System`ProgressIndicatorBoxOptions
 *
 *                   ProgressIndicatorBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for ProgressIndicatorBox objects.
 * Usage:                                              1      1     2      2
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
fun progressIndicatorBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProgressIndicatorBoxOptions", arguments.toMutableList(), options)
}
