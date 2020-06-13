package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CountDistinct
 *
 * Full name:        System`CountDistinct
 *
 * Usage:            CountDistinct[list] gives the number of distinct elements that appear in list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CountDistinct
 * Documentation:    web: http://reference.wolfram.com/language/ref/CountDistinct.html
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
fun countDistinct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CountDistinct", arguments.toMutableList(), options)
}
