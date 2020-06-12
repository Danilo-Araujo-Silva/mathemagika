package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BSplineCurve3DBoxOptions
 *
 * Full name:        System`BSplineCurve3DBoxOptions
 *
 *                   BSplineCurve3DBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for BSplineCurve3DBox objects.
 * Usage:                                           1      1     2      2
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
fun bSplineCurve3DBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BSplineCurve3DBoxOptions", arguments.toMutableList(), options)
}
