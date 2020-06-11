package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GroupElements
 *
 * Full name:        System`GroupElements
 *
 *                   GroupElements[group] returns the list of all elements of group.
 *                   GroupElements[group, {r , …, r }] returns the elements numbered r , …, r  in group in the standard order.
 * Usage:                                   1      k                                  1      k
 *
 * Options:          GroupActionBase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupElements
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupElements.html
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
fun groupElements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupElements", arguments.toMutableList(), options)
}
