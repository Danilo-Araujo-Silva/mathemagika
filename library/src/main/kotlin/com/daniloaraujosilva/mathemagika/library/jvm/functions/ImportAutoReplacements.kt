package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImportAutoReplacements
 *
 * Full name:        System`ImportAutoReplacements
 *
 * Usage:            ImportAutoReplacements is an option for cells that specifies which replacement rules the Wolfram Language automatically applies when importing text.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImportAutoReplacements
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImportAutoReplacements.html
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
fun importAutoReplacements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImportAutoReplacements", arguments.toMutableList(), options)
}
