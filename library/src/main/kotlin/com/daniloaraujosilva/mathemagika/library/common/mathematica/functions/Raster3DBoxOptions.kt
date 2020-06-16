package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Raster3DBoxOptions
 *
 * Full name:        System`Raster3DBoxOptions
 *
 *                   Raster3DBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for Raster3DBox objects.
 * Usage:                                     1      1     2      2
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
fun raster3DBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Raster3DBoxOptions", arguments.toMutableList(), options)
}
