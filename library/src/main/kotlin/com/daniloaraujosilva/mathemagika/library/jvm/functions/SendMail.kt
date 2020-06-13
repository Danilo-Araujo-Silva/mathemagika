package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SendMail
 *
 * Full name:        System`SendMail
 *
 *                   SendMail[body] sends mail consisting of body to the address specified by $CloudUserID.
 *                   SendMail[{"subject"}] sends mail with the specified subject and no body.
 *                   SendMail[{"subject", body}] sends mail with the specified subject and body.
 *                   SendMail[{"subject", body, att}] sends mail with the attachment or attachments att.
 *                   SendMail["to", content] sends mail to the specified To: address.
 *                   SendMail[{to , to , …}, content] sends mail to multiple To: addresses.
 *                               1    2
 *                   SendMail[{{to , …}, {cc , …}}, content] includes the cc  as Cc: addresses.
 *                                1         1                               i
 *                   SendMail[{{to , …}, {cc , …}, {bcc , …}}, content] also includes the bcc  as Bcc: addresses.
 *                                1         1          1                                     i
 * Usage:            SendMail[assoc] sends mail with elements specified in the association assoc.
 *
 *                   MailAddressValidation :> Automatic
 * Options:          MailSettings -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SendMail
 * Documentation:    web: http://reference.wolfram.com/language/ref/SendMail.html
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
fun sendMail(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SendMail", arguments.toMutableList(), options)
}
