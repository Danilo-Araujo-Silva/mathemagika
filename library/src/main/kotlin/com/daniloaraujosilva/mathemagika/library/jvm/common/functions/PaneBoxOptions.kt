package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PaneBoxOptions
 *
 * Full name:        System`PaneBoxOptions
 *
 *                   PaneBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for PaneBox objects.
 * Usage:                                 1      1     2      2
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
fun paneBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PaneBoxOptions", arguments.toMutableList(), options)
}