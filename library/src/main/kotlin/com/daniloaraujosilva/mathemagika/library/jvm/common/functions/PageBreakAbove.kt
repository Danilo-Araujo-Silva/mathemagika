package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PageBreakAbove
 *
 * Full name:        System`PageBreakAbove
 *
 * Usage:            PageBreakAbove is an option for Cell which specifies whether a page break should be made immediately above the cell if the notebook that contains the cell is printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PageBreakAbove
 * Documentation:    web: http://reference.wolfram.com/language/ref/PageBreakAbove.html
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
fun pageBreakAbove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PageBreakAbove", arguments.toMutableList(), options)
}
