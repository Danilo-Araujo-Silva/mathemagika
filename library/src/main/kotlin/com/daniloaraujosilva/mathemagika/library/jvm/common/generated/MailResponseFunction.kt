package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MailResponseFunction
 * 
 * Full name:        System`MailResponseFunction
 * 
 * Usage:            MailResponseFunction is an option for MailReceiverFunction that specifies what function to apply to respond to the sender of mail received by a MailReceiverFunction.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MailResponseFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailResponseFunction.html
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
fun mailResponseFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailResponseFunction", arguments.toMutableList(), options)
}
