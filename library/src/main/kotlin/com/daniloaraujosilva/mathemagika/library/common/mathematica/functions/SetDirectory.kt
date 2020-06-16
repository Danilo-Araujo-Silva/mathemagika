package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SetDirectory
 *
 * Full name:        System`SetDirectory
 *
 *                   SetDirectory["dir"] sets the current working directory to dir.
 * Usage:            SetDirectory[] sets the current working directory to your "home" directory.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetDirectory.html
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
fun setDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetDirectory", arguments.toMutableList(), options)
}
