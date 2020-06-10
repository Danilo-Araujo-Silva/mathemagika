package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ButtonNotebook
 * 
 * Full name:        System`ButtonNotebook
 * 
 * Usage:            ButtonNotebook[] gives the notebook, if any, that contains the button which initiated the current evaluation. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ButtonNotebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonNotebook.html
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
fun buttonNotebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonNotebook", arguments.toMutableList(), options)
}
