package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CopyDirectory
 *
 * Full name:        System`CopyDirectory
 *
 *                   CopyDirectory[dir , dir ] copies the directory dir  to dir .
 * Usage:                             1     2                          1       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CopyDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/CopyDirectory.html
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
fun copyDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CopyDirectory", arguments.toMutableList(), options)
}
