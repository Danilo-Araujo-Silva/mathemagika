package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StirlingS2
 *
 * Full name:        System`StirlingS2
 *
 *                                                                                  (m)
 *                   StirlingS2[n, m] gives the Stirling number of the second kind    .
 * Usage:                                                                           n
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StirlingS2
 * Documentation:    web: http://reference.wolfram.com/language/ref/StirlingS2.html
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
fun stirlingS2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StirlingS2", arguments.toMutableList(), options)
}
