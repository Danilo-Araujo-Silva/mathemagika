package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MailReceiverFunction
 *
 * Full name:        System`MailReceiverFunction
 *
 * Usage:            MailReceiverFunction[fun] represents a mail receiver function that applies fun to any mail message it receives.
 *
 *                   MailResponseFunction -> Automatic
 * Options:          ReturnReceiptFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MailReceiverFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailReceiverFunction.html
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
fun mailReceiverFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailReceiverFunction", arguments.toMutableList(), options)
}
