package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReturnReceiptFunction
 *
 * Full name:        System`ReturnReceiptFunction
 *
 * Usage:            ReturnReceiptFunction is an option for MailReceiverFunction that specifies what function to apply if a return receipt is requested for mail received by a MailReceiverFunction.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReturnReceiptFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReturnReceiptFunction.html
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
fun returnReceiptFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReturnReceiptFunction", arguments.toMutableList(), options)
}
