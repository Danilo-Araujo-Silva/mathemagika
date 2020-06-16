package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UnderscriptBoxOptions
 *
 * Full name:        System`UnderscriptBoxOptions
 *
 * Usage:            UnderscriptBoxOptions is an option for selections that specifies settings for UnderscriptBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnderscriptBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnderscriptBoxOptions.html
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
fun underscriptBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnderscriptBoxOptions", arguments.toMutableList(), options)
}
