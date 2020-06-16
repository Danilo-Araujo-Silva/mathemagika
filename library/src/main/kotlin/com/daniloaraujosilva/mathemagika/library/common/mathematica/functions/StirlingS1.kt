package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StirlingS1
 *
 * Full name:        System`StirlingS1
 *
 *                                                                                 (m)
 *                   StirlingS1[n, m] gives the Stirling number of the first kind S   .
 * Usage:                                                                          n
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StirlingS1
 * Documentation:    web: http://reference.wolfram.com/language/ref/StirlingS1.html
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
fun stirlingS1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StirlingS1", arguments.toMutableList(), options)
}
