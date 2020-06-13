package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GroupPageBreakWithin
 *
 * Full name:        System`GroupPageBreakWithin
 *
 * Usage:            GroupPageBreakWithin is an option for Cell that specifies whether a page break should be allowed within the group of cells if the notebook that contains the group is printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GroupPageBreakWithin
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupPageBreakWithin.html
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
fun groupPageBreakWithin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupPageBreakWithin", arguments.toMutableList(), options)
}
