package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MailServerConnection
 *
 * Full name:        System`MailServerConnection
 *
 * Usage:            MailServerConnection[…] is a symbolic representation of a connection to an incoming mail server.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/MailServerConnection
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailServerConnection.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 *                   MailServerConnection[(MailLink`Private`data_)?AssociationQ]["Properties"] := Keys[MailLink`Private`data]
 *                   MailServerConnection[(MailLink`Private`data_)?AssociationQ]["MailFolderList"] := Values[Lookup[MailLink`Private`data, "MailFolderAssociation"]]
 *                   MailServerConnection[(MailLink`Private`data_)?AssociationQ][MailLink`Private`key_] /; KeyExistsQ[MailLink`Private`data, MailLink`Private`key] := Lookup[MailLink`Private`data, MailLink`Private`key]
 *                   MailServerConnection[(MailLink`Private`data_)?AssociationQ][MailLink`Private`folder_] /; KeyExistsQ[Lookup[MailLink`Private`data, "MailFolderAssociation"], MailLink`Private`folder] := Lookup[MailLink`Private`data, "MailFolderAssociation"][MailLink`Private`folder]
 * Sub values:       MailServerConnection[(MailLink`Private`data_)?AssociationQ][MailLink`Private`folder_String] := Module[{MailLink`Private`res}, MailLink`Private`res = IMAPLink`IMAPExecute[Lookup[MailLink`Private`data, "Connection"], "SelectFolder", {"Path" -> MailLink`Private`folder}]; If[AssociationQ[MailLink`Private`res], MailFolder[MailLink`Private`res], MailLink`Private`res]]
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun mailServerConnection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailServerConnection", arguments.toMutableList(), options)
}
