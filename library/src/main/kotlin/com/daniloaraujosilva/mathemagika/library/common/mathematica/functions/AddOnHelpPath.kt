package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AddOnHelpPath
 *
 * Full name:        System`AddOnHelpPath
 *
 * Usage:            AddOnHelpPath is a global option that specifies which directories are searched for additional help files used within the help system.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AddOnHelpPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/AddOnHelpPath.html
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
fun addOnHelpPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AddOnHelpPath", arguments.toMutableList(), options)
}
