package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeometricTransformationBoxOptions
 *
 * Full name:        System`GeometricTransformationBoxOptions
 *
 *                   GeometricTransformationBoxOptions  {opt   val , opt   val , …} is an option that specifies settings for GeometricTransformationBox objects.
 * Usage:                                                    1      1     2      2
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
fun geometricTransformationBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricTransformationBoxOptions", arguments.toMutableList(), options)
}
