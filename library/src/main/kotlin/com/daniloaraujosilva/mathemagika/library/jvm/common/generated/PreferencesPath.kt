package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PreferencesPath
 * 
 * Full name:        System`PreferencesPath
 * 
 * Usage:            PreferencesPath is a global option that specifies which directories are searched for user-specific settings when the Wolfram System is started.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PreferencesPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreferencesPath.html
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
fun preferencesPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreferencesPath", arguments.toMutableList(), options)
}
