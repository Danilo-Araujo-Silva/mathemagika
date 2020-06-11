package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OverscriptBoxOptions
 *
 * Full name:        System`OverscriptBoxOptions
 *
 * Usage:            OverscriptBoxOptions is an option that specifies the style and display of OverscriptBox constructs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OverscriptBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverscriptBoxOptions.html
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
fun overscriptBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverscriptBoxOptions", arguments.toMutableList(), options)
}
