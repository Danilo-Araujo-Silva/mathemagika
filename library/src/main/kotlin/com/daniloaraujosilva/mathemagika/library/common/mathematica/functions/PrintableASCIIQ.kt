package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrintableASCIIQ
 *
 * Full name:        System`PrintableASCIIQ
 *
 * Usage:            PrintableASCIIQ[string] yields True if the string contains only printable ASCII characters, and yields False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrintableASCIIQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrintableASCIIQ.html
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
fun printableASCIIQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrintableASCIIQ", arguments.toMutableList(), options)
}
