package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MailFolder
 *
 * Full name:        System`MailFolder
 *
 * Usage:            MailFolder[…] represents a mail folder associated with an active mail server connection.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/MailFolder
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailFolder.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 *                   MailFolder[MailLink`Private`data_Association]["Properties"] := Keys[MailLink`Private`data]
 *                   MailFolder[MailLink`Private`data_Association][MailLink`Private`key_String] /; KeyExistsQ[MailLink`Private`data, MailLink`Private`key] := MailLink`Private`data[MailLink`Private`key]
 *                   MailFolder[MailLink`Private`data_Association][MailLink`Private`messagePosition_Integer] := With[{MailLink`Private`res = IMAPLink`IMAPExecute[MailLink`Private`data["Connection"], "GetMailItems", Join[KeyTake[MailLink`Private`data, "Path"], Association["Positions" -> {MailLink`Private`messagePosition}]]]}, If[Length[MailLink`Private`res] === 1, MailItem[MailLink`Private`res[[1]]], $Failed]]
 *                   MailFolder[(MailLink`Private`data_)?AssociationQ][All] := MailFolder[MailLink`Private`data][1 ;; -1]
 *                   MailFolder[(MailLink`Private`data_)?AssociationQ][MailLink`Private`messagePositions_Span] := Module[{MailLink`Private`res}, MailLink`Private`res = IMAPLink`IMAPExecute[MailLink`Private`data["Connection"], "GetMailItems", Join[KeyTake[MailLink`Private`data, "Path"], Association["Positions" -> MailLink`Private`messagePositions]]]; If[ !FailureQ[MailLink`Private`res], MailItem /@ MailLink`Private`res, MailLink`Private`res]]
 *                   MailFolder[(MailLink`Private`data_)?AssociationQ][MailLink`Private`messagePositions_List] := MailItem /@ IMAPLink`IMAPExecute[MailLink`Private`data["Connection"], "GetMailItems", Join[KeyTake[MailLink`Private`data, "Path"], Association["Positions" -> MailLink`Private`messagePositions]]]
 *                   MailFolder[MailLink`Private`mailFolderAssoc_Association][] := Module[{MailLink`Private`assoc, MailLink`Private`connection}, MailLink`Private`connection = Lookup[MailLink`Private`mailFolderAssoc, "Connection"]; MailLink`Private`assoc = IMAPLink`IMAPExecute[MailLink`Private`connection, "SelectFolder", KeyTake[MailLink`Private`mailFolderAssoc, "Path"]]; MailFolder[MailLink`Private`assoc]]
 * Sub values:       MailFolder[MailLink`Private`mailFolderAssoc_Association][MailLink`Private`command_String] := Module[{MailLink`Private`assoc, MailLink`Private`connection}, MailLink`Private`connection = Lookup[MailLink`Private`mailFolderAssoc, "Connection"]; MailLink`Private`assoc = IMAPLink`IMAPExecute[MailLink`Private`connection, "SelectFolder", KeyTake[MailLink`Private`mailFolderAssoc, "Path"]]; IMAPLink`IMAPExecute[MailLink`Private`connection, MailLink`Private`command]]
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun mailFolder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailFolder", arguments.toMutableList(), options)
}
