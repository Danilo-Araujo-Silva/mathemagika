package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExclusionsStyle
 *
 * Full name:        System`ExclusionsStyle
 *
 * Usage:            ExclusionsStyle is an option to plotting functions that specifies how to render subregions excluded according to Exclusions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExclusionsStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExclusionsStyle.html
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
fun exclusionsStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExclusionsStyle", arguments.toMutableList(), options)
}
