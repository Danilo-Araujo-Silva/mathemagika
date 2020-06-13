package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PacletDirectoryLoad
 *
 * Full name:        System`PacletDirectoryLoad
 *
 *                   PacletDirectoryLoad[dir] makes paclets in dir visible in the current session.
 *                   PacletDirectoryLoad[{dir , dir , …}] makes paclets in all the dir  visible in the current session.
 * Usage:                                    1     2                                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletDirectoryLoad
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletDirectoryLoad.html
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
fun pacletDirectoryLoad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletDirectoryLoad", arguments.toMutableList(), options)
}
