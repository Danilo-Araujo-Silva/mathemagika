package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GroupElementPosition
 * 
 * Full name:        System`GroupElementPosition
 * 
 *                   GroupElementPosition[group, g] returns the position of the element g in the list of elements of group.
 *                   GroupElementPosition[group, {g , …, g }] returns the list of positions of the elements g , …, g  in group.
 * Usage:                                          1      n                                                  1      n
 * 
 * Options:          GroupActionBase -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GroupElementPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupElementPosition.html
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
fun groupElementPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupElementPosition", arguments.toMutableList(), options)
}
