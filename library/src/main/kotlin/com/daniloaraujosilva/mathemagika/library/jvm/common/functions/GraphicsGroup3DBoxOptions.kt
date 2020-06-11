package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphicsGroup3DBoxOptions
 *
 * Full name:        System`GraphicsGroup3DBoxOptions
 *
 *                   GraphicsGroup3DBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for GraphicsGroup3DBox objects.
 * Usage:                                            1      1     2      2
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
fun graphicsGroup3DBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphicsGroup3DBoxOptions", arguments.toMutableList(), options)
}
