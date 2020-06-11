package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PageHeaderLines
 *
 * Full name:        System`PageHeaderLines
 *
 * Usage:            PageHeaderLines is an option for notebooks that specifies whether a horizontal line is inserted at the top of each page when the notebook is printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PageHeaderLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageHeaderLines.html
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
fun pageHeaderLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageHeaderLines", arguments.toMutableList(), options)
}
