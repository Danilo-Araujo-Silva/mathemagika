package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnderoverscriptBoxOptions
 *
 * Full name:        System`UnderoverscriptBoxOptions
 *
 * Usage:            UnderoverscriptBoxOptions is an option for selections that specifies settings for UnderoverscriptBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnderoverscriptBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnderoverscriptBoxOptions.html
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
fun underoverscriptBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnderoverscriptBoxOptions", arguments.toMutableList(), options)
}
