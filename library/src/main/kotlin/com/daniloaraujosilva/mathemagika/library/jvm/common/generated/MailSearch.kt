package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MailSearch
 * 
 * Full name:        System`MailSearch
 * 
 *                   MailSearch[folder, assoc] searches the specified mail folder for messages with properties matching elements in assoc.
 *                   MailSearch[assoc] searches the current default mail inbox.
 * Usage:            MailSearch[] gives the list of unread messages in the current default mail inbox.
 * 
 *                   MaxItems -> Automatic
 * Options:          TimeConstraint -> Automatic
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/MailSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailSearch.html
 * 
 *                   MailSearch[MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Association["Property" -> {}, "Deleted" -> False, "Seen" -> False], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_String, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Association["Text" -> MailLink`Private`query, "Property" -> {}], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_String, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Association["Text" -> MailLink`Private`query, "Property" -> {}], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Association, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[MailLink`Private`query, Association["Property" -> Lookup[MailLink`Private`query, "Property", {}]]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Association, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[MailLink`Private`query, Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Rule, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[Association[MailLink`Private`query], Association["Property" -> {}]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Rule, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[Association[MailLink`Private`query], Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`folder_MailFolder, MailLink`Private`query_String, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] /; MatchQ[Lookup[Normal[MailLink`Private`folder], "ObjectType", None], "MailFolder"] := MailSearch[MailLink`Private`folder, Association["Text" -> MailLink`Private`query, "Property" -> MailLink`Private`prop], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`ms_MailServerConnection, MailLink`Private`query_Association, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := Join[Sequence @@ (MailSearch[#1, Join[MailLink`Private`query, Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts] & ) /@ MailLink`Private`ms["MailFolderList"]]
 *                   MailSearch[MailLink`Private`ms_MailServerConnection, MailLink`Private`query_Association, MailLink`Private`opts:OptionsPattern[]] := Join[Sequence @@ (MailSearch[#1, Join[MailLink`Private`query, Association["Property" -> {}]], MailLink`Private`opts] & ) /@ MailLink`Private`ms["MailFolderList"]]
 *                   MailSearch[MailLink`Private`folders:{MailFolder[_Association]..}, MailLink`Private`query_Association, MailLink`Private`opts:OptionsPattern[]] := Module[{MailLink`Private`nb, MailLink`Private`mailFolderAssoc, MailLink`Private`assoc, MailLink`Private`ids, MailLink`Private`allIds, MailLink`Private`connection, MailLink`Private`dir}, IMAPLink`Private`$downloadMessage = "Searching..."; MailLink`Private`nb = PrintTemporary[Dynamic[Internal`LoadingPanel[IMAPLink`Private`$downloadMessage]]]; MailLink`Private`allIds = ((MailLink`Private`mailFolderAssoc = Extract[#1, 1]; MailLink`Private`dir = Lookup[MailLink`Private`mailFolderAssoc, "Directory"]; MailLink`Private`connection = Lookup[MailLink`Private`mailFolderAssoc, "Connection"]; MailLink`Private`assoc = IMAPLink`IMAPExecute[MailLink`Private`connection, "SelectFolder", KeyTake[MailLink`Private`mailFolderAssoc, "Path"]]; MailLink`Private`ids = IMAPLink`IMAPExecute[MailLink`Private`connection, "Search", Join[MailLink`Private`query, Association["MailFolderAssociation" -> MailLink`Private`mailFolderAssoc], Association[MaxItems -> OptionValue[MaxItems], TimeConstraint -> OptionValue[TimeConstraint]]]]; MailLink`Private`ids) & ) /@ MailLink`Private`folders; MailLink`Private`allIds = Flatten[MailLink`Private`allIds]; If[MailLink`Private`allIds =!= {Missing["No matches found."]}, Dataset[Flatten[MailLink`Private`allIds]][All, {"MessagePosition", "UID", "Flagged", "Answered", "Deleted", "Draft", "Seen", "Tags", "HasAttachments", "Subject", "OriginatingDate", "MailItem", "From", "ToList", "CcList", "BccList", "BodyPreview", "MessageID"}][Reverse], Missing["No matches found."]]]
 *                   MailSearch[MailLink`Private`folder_MailFolder, (MailLink`Private`query_)?AssociationQ, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] /; MatchQ[Lookup[Normal[MailLink`Private`folder], "ObjectType", None], "MailFolder"] := MailSearch[MailLink`Private`folder, Join[MailLink`Private`query, Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts]
 * Definitions:      MailSearch[MailLink`Private`mailFolder_MailFolder, (MailLink`Private`query_)?AssociationQ, MailLink`Private`opts:OptionsPattern[]] := MailSearch[{MailLink`Private`mailFolder}, MailLink`Private`query, MailLink`Private`opts]
 * 
 * Own values:       None
 * 
 *                   MailSearch[MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Association["Property" -> {}, "Deleted" -> False, "Seen" -> False], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_String, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Association["Text" -> MailLink`Private`query, "Property" -> {}], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_String, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Association["Text" -> MailLink`Private`query, "Property" -> {}], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Association, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[MailLink`Private`query, Association["Property" -> Lookup[MailLink`Private`query, "Property", {}]]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Association, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[MailLink`Private`query, Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Rule, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[Association[MailLink`Private`query], Association["Property" -> {}]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`query_Rule, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := MailSearch[$DefaultMailbox, Join[Association[MailLink`Private`query], Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`folder_MailFolder, MailLink`Private`query_String, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] /; MatchQ[Lookup[Normal[MailLink`Private`folder], "ObjectType", None], "MailFolder"] := MailSearch[MailLink`Private`folder, Association["Text" -> MailLink`Private`query, "Property" -> MailLink`Private`prop], MailLink`Private`opts]
 *                   MailSearch[MailLink`Private`ms_MailServerConnection, MailLink`Private`query_Association, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] := Join[Sequence @@ (MailSearch[#1, Join[MailLink`Private`query, Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts] & ) /@ MailLink`Private`ms["MailFolderList"]]
 *                   MailSearch[MailLink`Private`ms_MailServerConnection, MailLink`Private`query_Association, MailLink`Private`opts:OptionsPattern[]] := Join[Sequence @@ (MailSearch[#1, Join[MailLink`Private`query, Association["Property" -> {}]], MailLink`Private`opts] & ) /@ MailLink`Private`ms["MailFolderList"]]
 *                   MailSearch[MailLink`Private`folders:{MailFolder[_Association]..}, MailLink`Private`query_Association, MailLink`Private`opts:OptionsPattern[]] := Module[{MailLink`Private`nb, MailLink`Private`mailFolderAssoc, MailLink`Private`assoc, MailLink`Private`ids, MailLink`Private`allIds, MailLink`Private`connection, MailLink`Private`dir}, IMAPLink`Private`$downloadMessage = "Searching..."; MailLink`Private`nb = PrintTemporary[Dynamic[Internal`LoadingPanel[IMAPLink`Private`$downloadMessage]]]; MailLink`Private`allIds = ((MailLink`Private`mailFolderAssoc = Extract[#1, 1]; MailLink`Private`dir = Lookup[MailLink`Private`mailFolderAssoc, "Directory"]; MailLink`Private`connection = Lookup[MailLink`Private`mailFolderAssoc, "Connection"]; MailLink`Private`assoc = IMAPLink`IMAPExecute[MailLink`Private`connection, "SelectFolder", KeyTake[MailLink`Private`mailFolderAssoc, "Path"]]; MailLink`Private`ids = IMAPLink`IMAPExecute[MailLink`Private`connection, "Search", Join[MailLink`Private`query, Association["MailFolderAssociation" -> MailLink`Private`mailFolderAssoc], Association[MaxItems -> OptionValue[MaxItems], TimeConstraint -> OptionValue[TimeConstraint]]]]; MailLink`Private`ids) & ) /@ MailLink`Private`folders; MailLink`Private`allIds = Flatten[MailLink`Private`allIds]; If[MailLink`Private`allIds =!= {Missing["No matches found."]}, Dataset[Flatten[MailLink`Private`allIds]][All, {"MessagePosition", "UID", "Flagged", "Answered", "Deleted", "Draft", "Seen", "Tags", "HasAttachments", "Subject", "OriginatingDate", "MailItem", "From", "ToList", "CcList", "BccList", "BodyPreview", "MessageID"}][Reverse], Missing["No matches found."]]]
 *                   MailSearch[MailLink`Private`folder_MailFolder, (MailLink`Private`query_)?AssociationQ, MailLink`Private`prop_List, MailLink`Private`opts:OptionsPattern[]] /; MatchQ[Lookup[Normal[MailLink`Private`folder], "ObjectType", None], "MailFolder"] := MailSearch[MailLink`Private`folder, Join[MailLink`Private`query, Association["Property" -> MailLink`Private`prop]], MailLink`Private`opts]
 * Down values:      MailSearch[MailLink`Private`mailFolder_MailFolder, (MailLink`Private`query_)?AssociationQ, MailLink`Private`opts:OptionsPattern[]] := MailSearch[{MailLink`Private`mailFolder}, MailLink`Private`query, MailLink`Private`opts]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun mailSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailSearch", arguments.toMutableList(), options)
}
