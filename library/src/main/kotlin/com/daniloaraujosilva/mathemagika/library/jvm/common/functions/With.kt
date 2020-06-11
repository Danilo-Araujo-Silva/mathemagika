package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             With
 *
 * Full name:        System`With
 *
 *                   With[{x = x , y = y , …}, expr] specifies that all occurrences of the symbols x, y, … in expr should be replaced by x , y , ….
 * Usage:                       0       0                                                                                                 0   0
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/With
 * Documentation:    web: http://reference.wolfram.com/language/ref/With.html
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
fun with(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("With", arguments.toMutableList(), options)
}
