package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PageFooters
 *
 * Full name:        System`PageFooters
 *
 * Usage:            PageFooters is an option for notebooks that specifies what should be inserted as the footer of each page of a notebook when it is printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PageFooters
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageFooters.html
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
fun pageFooters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageFooters", arguments.toMutableList(), options)
}
