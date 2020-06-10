package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InterpretationBox
 * 
 * Full name:        System`InterpretationBox
 * 
 * Usage:            InterpretationBox[boxes, expr] is a low-level box construct that displays as boxes but is interpreted on input as expr. 
 * 
 * Options:          None
 * 
 *                   HoldAllComplete
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InterpretationBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/InterpretationBox.html
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
fun interpretationBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InterpretationBox", arguments.toMutableList(), options)
}
