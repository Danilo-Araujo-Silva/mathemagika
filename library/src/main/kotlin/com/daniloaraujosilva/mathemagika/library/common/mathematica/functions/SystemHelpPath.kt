package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemHelpPath
 *
 * Full name:        System`SystemHelpPath
 *
 * Usage:            SystemHelpPath is a global option that specifies which directories are searched for the help notebooks used within the help system.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SystemHelpPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemHelpPath.html
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
fun systemHelpPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemHelpPath", arguments.toMutableList(), options)
}
