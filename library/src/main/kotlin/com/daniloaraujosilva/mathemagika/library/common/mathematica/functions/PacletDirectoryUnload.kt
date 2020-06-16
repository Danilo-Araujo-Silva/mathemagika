package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PacletDirectoryUnload
 *
 * Full name:        System`PacletDirectoryUnload
 *
 *                   PacletDirectoryUnload[dir] makes paclets in dir no longer visible in the current session.
 *                   PacletDirectoryUnload[{dir , dir , …}] makes paclets in all the dir  no longer visible in the current session.
 * Usage:                                      1     2                                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletDirectoryUnload
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletDirectoryUnload.html
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
fun pacletDirectoryUnload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletDirectoryUnload", arguments.toMutableList(), options)
}
