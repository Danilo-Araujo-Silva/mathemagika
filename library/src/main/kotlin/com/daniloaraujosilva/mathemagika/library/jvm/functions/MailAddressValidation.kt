package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MailAddressValidation
 *
 * Full name:        System`MailAddressValidation
 *
 * Usage:            MailAddressValidation is an option for SendMail that specifies whether and how to validate email addresses.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MailAddressValidation
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailAddressValidation.html
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
fun mailAddressValidation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailAddressValidation", arguments.toMutableList(), options)
}
