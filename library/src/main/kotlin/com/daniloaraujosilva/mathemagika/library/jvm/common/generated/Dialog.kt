package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Dialog
 * 
 * Full name:        System`Dialog
 * 
 *                   Dialog[] initiates a dialog. 
 * Usage:            Dialog[expr] initiates a dialog with expr as the current value of %. 
 * 
 *                   DialogProlog -> Null
 * Options:          DialogSymbols -> {}
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Dialog
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dialog.html
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
fun dialog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dialog", arguments.toMutableList(), options)
}
