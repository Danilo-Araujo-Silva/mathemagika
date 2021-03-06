package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CharacterEncodingsPath
 *
 * Full name:        System`CharacterEncodingsPath
 *
 * Usage:            CharacterEncodingsPath is a global option that specifies which directories are searched for character encoding files.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CharacterEncodingsPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacterEncodingsPath.html
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
fun characterEncodingsPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacterEncodingsPath", arguments.toMutableList(), options)
}
