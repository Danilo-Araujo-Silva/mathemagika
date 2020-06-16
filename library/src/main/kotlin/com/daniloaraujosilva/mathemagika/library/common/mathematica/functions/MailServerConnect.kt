package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MailServerConnect
 *
 * Full name:        System`MailServerConnect
 *
 *                   MailServerConnect[] connects to your default incoming mail server.
 *                   MailServerConnect["server"] connects to the specified incoming mail server "server".
 *                   MailServerConnect["server", userid] connects using the specified user ID userid.
 * Usage:            MailServerConnect["server", userid, password] connects using userid and password.
 *
 *                   Authentication -> <|Username -> None, Password -> None|>
 * Options:          MailSettings -> <|Server -> None, PortNumber -> Automatic, Username -> None, Password -> None, EncryptionProtocol -> Automatic, MailFolder -> INBOX|>
 *
 * Attributes:
 *
 *                   local: paclet:ref/MailServerConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailServerConnect.html
 *
 *                   MailServerConnect[] := With[{MailLink`Private`res = Catch[MailLink`Private`implMailServerConnect[Join[$IncomingMailSettings, MailLink`Private`decryptPassword[$IncomingMailSettings]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *                   MailServerConnect[MailLink`Private`server_String, MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailServerConnect[MailSettings -> Join[MailLink`Utilities`overWriteDefaults[OptionValue[Authentication], MailLink`Utilities`getMSettings[OptionValue[MailSettings]]], Association["Server" -> MailLink`Private`server]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *                   MailServerConnect[MailLink`Private`server_String, MailLink`Private`userName_String, MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailServerConnect[MailSettings -> Join[MailLink`Utilities`overWriteDefaults[OptionValue[Authentication], MailLink`Utilities`getMSettings[OptionValue[MailSettings]]], Association["Server" -> MailLink`Private`server, "Username" -> MailLink`Private`userName]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *                   MailServerConnect[MailLink`Private`server_String, MailLink`Private`userName_String, MailLink`Private`pass_String, MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailLink`Private`implMailServerConnect[Join[MailLink`Private`$defaultIncomingMailSettings, MailLink`Utilities`overWriteDefaults[OptionValue[Authentication], MailLink`Utilities`getMSettings[OptionValue[MailSettings]]], Association["Server" -> MailLink`Private`server, "Username" -> MailLink`Private`userName, "Password" -> MailLink`Private`pass]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 * Definitions:      MailServerConnect[MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailLink`Private`implMailServerConnect[Join[MailLink`Private`$defaultIncomingMailSettings, MailLink`Utilities`getMSettings[OptionValue[MailSettings]], MailLink`Private`decryptPassword[Join[MailLink`Private`$defaultIncomingMailSettings, MailLink`Utilities`getMSettings[OptionValue[MailSettings]]]]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *
 * Own values:       None
 *
 *                   MailServerConnect[] := With[{MailLink`Private`res = Catch[MailLink`Private`implMailServerConnect[Join[$IncomingMailSettings, MailLink`Private`decryptPassword[$IncomingMailSettings]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *                   MailServerConnect[MailLink`Private`server_String, MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailServerConnect[MailSettings -> Join[MailLink`Utilities`overWriteDefaults[OptionValue[Authentication], MailLink`Utilities`getMSettings[OptionValue[MailSettings]]], Association["Server" -> MailLink`Private`server]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *                   MailServerConnect[MailLink`Private`server_String, MailLink`Private`userName_String, MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailServerConnect[MailSettings -> Join[MailLink`Utilities`overWriteDefaults[OptionValue[Authentication], MailLink`Utilities`getMSettings[OptionValue[MailSettings]]], Association["Server" -> MailLink`Private`server, "Username" -> MailLink`Private`userName]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *                   MailServerConnect[MailLink`Private`server_String, MailLink`Private`userName_String, MailLink`Private`pass_String, MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailLink`Private`implMailServerConnect[Join[MailLink`Private`$defaultIncomingMailSettings, MailLink`Utilities`overWriteDefaults[OptionValue[Authentication], MailLink`Utilities`getMSettings[OptionValue[MailSettings]]], Association["Server" -> MailLink`Private`server, "Username" -> MailLink`Private`userName, "Password" -> MailLink`Private`pass]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 * Down values:      MailServerConnect[MailLink`Private`opts:OptionsPattern[]] := With[{MailLink`Private`res = Catch[MailLink`Private`implMailServerConnect[Join[MailLink`Private`$defaultIncomingMailSettings, MailLink`Utilities`getMSettings[OptionValue[MailSettings]], MailLink`Private`decryptPassword[Join[MailLink`Private`$defaultIncomingMailSettings, MailLink`Utilities`getMSettings[OptionValue[MailSettings]]]]]], CURLLink`Utilities`Exception, MailLink`Private`foo[#1, CURLLink`Utilities`Exception] & ]}, MailLink`Private`res /; MailLink`Private`res =!= False]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun mailServerConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailServerConnect", arguments.toMutableList(), options)
}
