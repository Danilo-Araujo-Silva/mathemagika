package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NullRecords
 *
 * Full name:        System`NullRecords
 *
 * Usage:            NullRecords is an option for Read and related functions which specifies whether null records should be taken to exist between repeated record separators.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NullRecords
 * Documentation:    web: http://reference.wolfram.com/language/ref/NullRecords.html
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
fun nullRecords(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NullRecords", arguments.toMutableList(), options)
}
