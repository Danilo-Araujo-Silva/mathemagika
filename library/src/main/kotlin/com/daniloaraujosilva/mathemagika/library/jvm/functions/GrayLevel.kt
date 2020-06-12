package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GrayLevel
 *
 * Full name:        System`GrayLevel
 *
 *                   GrayLevel[level] is a graphics directive specifying that objects that follow are to be displayed in the gray level given.
 * Usage:            GrayLevel[g, a] specifies opacity a.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GrayLevel
 * Documentation:    web: http://reference.wolfram.com/language/ref/GrayLevel.html
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
fun grayLevel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GrayLevel", arguments.toMutableList(), options)
}
