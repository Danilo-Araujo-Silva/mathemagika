package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemDialogInput
 * 
 * Full name:        System`SystemDialogInput
 * 
 *                   SystemDialogInput["type"] brings up an interactive system dialog and returns the value chosen in the dialog. 
 * Usage:            SystemDialogInput["type", init] uses init as the initial setting in the dialog.
 * 
 * Options:          WindowTitle -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemDialogInput
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemDialogInput.html
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
fun systemDialogInput(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemDialogInput", arguments.toMutableList(), options)
}
