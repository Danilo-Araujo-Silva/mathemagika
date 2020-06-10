package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SelectionMove
 * 
 * Full name:        System`SelectionMove
 * 
 *                   SelectionMove[obj, dir, unit] moves the current selection in an open notebook in the front end in the direction dir by the specified unit. 
 * Usage:            SelectionMove[obj, dir, unit, n] repeats the move n times. 
 * 
 * Options:          AutoScroll -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SelectionMove
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectionMove.html
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
fun selectionMove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectionMove", arguments.toMutableList(), options)
}
