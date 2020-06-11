package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FontSubstitutions
 *
 * Full name:        System`FontSubstitutions
 *
 * Usage:            FontSubstitutions is an option for Cell that gives a list of substitutions to try for font family names.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FontSubstitutions
 * Documentation:    web: http://reference.wolfram.com/language/ref/FontSubstitutions.html
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
fun fontSubstitutions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FontSubstitutions", arguments.toMutableList(), options)
}
