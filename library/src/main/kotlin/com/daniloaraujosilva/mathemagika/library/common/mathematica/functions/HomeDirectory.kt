package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HomeDirectory
 *
 * Full name:        System`HomeDirectory
 *
 * Usage:            System`HomeDirectory
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HomeDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/HomeDirectory.html
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
fun homeDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HomeDirectory", arguments.toMutableList(), options)
}
