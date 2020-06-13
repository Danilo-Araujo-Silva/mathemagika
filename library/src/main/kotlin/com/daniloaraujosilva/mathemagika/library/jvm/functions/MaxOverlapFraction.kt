package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MaxOverlapFraction
 *
 * Full name:        System`MaxOverlapFraction
 *
 * Usage:            MaxOverlapFraction is an option that specifies the maximum acceptable overlap between different identifications.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxOverlapFraction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxOverlapFraction.html
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
fun maxOverlapFraction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxOverlapFraction", arguments.toMutableList(), options)
}
