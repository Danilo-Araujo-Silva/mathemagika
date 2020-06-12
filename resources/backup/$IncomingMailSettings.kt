package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             <|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>
 *
 * Full name:        Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, FullName]
 *
 * Usage:            Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, Usage]
 *
 * Options:          Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, Options]
 *
 * Attributes:       Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, Attributes]
 *
 *                   local: <>Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, Documentation][Local]
 * Documentation:    web: <>Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, Documentation][Web]
 *
 * Definitions:      Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, Definitions]
 *
 * Own values:       Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, OwnValues]
 *
 * Down values:      Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, DownValues]
 *
 * Up values:        Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, UpValues]
 *
 * Sub values:       Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, SubValues]
 *
 * Default value:    Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, DefaultValues]
 *
 * Numeric values:   Information[<|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>, NValues]
 */
fun `$IncomingMailSettings`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$IncomingMailSettings", arguments.toMutableList(), options)
}
