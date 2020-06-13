package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DynamicModuleBoxOptions
 *
 * Full name:        System`DynamicModuleBoxOptions
 *
 *                   DynamicModuleBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for DynamicModuleBox objects.
 * Usage:                                          1      1     2      2
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
fun dynamicModuleBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicModuleBoxOptions", arguments.toMutableList(), options)
}
