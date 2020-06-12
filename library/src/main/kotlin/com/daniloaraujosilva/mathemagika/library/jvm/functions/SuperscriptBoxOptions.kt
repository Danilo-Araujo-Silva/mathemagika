package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SuperscriptBoxOptions
 *
 * Full name:        System`SuperscriptBoxOptions
 *
 * Usage:            SuperscriptBoxOptions is an option for selections that specifies settings for SuperscriptBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SuperscriptBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuperscriptBoxOptions.html
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
fun superscriptBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuperscriptBoxOptions", arguments.toMutableList(), options)
}
