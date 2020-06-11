package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Union
 *
 * Full name:        System`Union
 *
 *                   Union[list , list , …] gives a sorted list of all the distinct elements that appear in any of the list .
 *                             1      2                                                                                    i
 * Usage:            Union[list] gives a sorted version of a list, in which all duplicated elements have been dropped.
 *
 * Options:          SameTest -> Automatic
 *
 *                   Flat
 *                   OneIdentity
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Union
 * Documentation:    web: http://reference.wolfram.com/language/ref/Union.html
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
fun union(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Union", arguments.toMutableList(), options)
}
