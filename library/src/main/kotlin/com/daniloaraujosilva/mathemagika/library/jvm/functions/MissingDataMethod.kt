package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MissingDataMethod
 *
 * Full name:        System`MissingDataMethod
 *
 * Usage:            MissingDataMethod is an option to TemporalData and other functions that controls how to process missing data.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MissingDataMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/MissingDataMethod.html
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
fun missingDataMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MissingDataMethod", arguments.toMutableList(), options)
}
