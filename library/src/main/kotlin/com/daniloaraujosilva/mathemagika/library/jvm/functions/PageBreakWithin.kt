package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PageBreakWithin
 *
 * Full name:        System`PageBreakWithin
 *
 * Usage:            PageBreakWithin is an option for Cell which specifies whether a page break should be allowed within the cell if the notebook that contains the cell is printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PageBreakWithin
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageBreakWithin.html
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
fun pageBreakWithin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageBreakWithin", arguments.toMutableList(), options)
}
