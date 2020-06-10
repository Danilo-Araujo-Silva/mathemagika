package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UndoTrackedVariables
 * 
 * Full name:        System`UndoTrackedVariables
 * 
 * Usage:            UndoTrackedVariables is an option for Manipulate, DynamicModule, and related functions that sets variables that should be tracked by the front end's undo mechanism.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/UndoTrackedVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/UndoTrackedVariables.html
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
fun undoTrackedVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UndoTrackedVariables", arguments.toMutableList(), options)
}
