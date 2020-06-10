package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RemoteConnect
 * 
 * Full name:        System`RemoteConnect
 * 
 *                   RemoteConnect["host"] connects to the specified remote host.
 *                   RemoteConnect[IPAddress["address"]] connects to the machine with the specified IP address.
 *                   RemoteConnect["host", username] connects using the specified username for the remote host.
 * Usage:            RemoteConnect["host", username, password] connects using the specified username and password.
 * 
 *                   Authentication :> $SSHAuthentication
 * Options:          RemoteAuthorizationCaching -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RemoteConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoteConnect.html
 * 
 *                   RemoteConnect[(SecureShellLink`Private`userhost_)?SecureShellLink`Private`validUserHostQ, SecureShellLink`Private`userpass_String:"", SecureShellLink`Private`pass_String:"", SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`auths, SecureShellLink`Private`username = "", SecureShellLink`Private`password = "", SecureShellLink`Private`result, SecureShellLink`Private`index, SecureShellLink`Private`hostname, SecureShellLink`Private`authenticated = -1, SecureShellLink`Private`cacheAuth, SecureShellLink`Private`uuid, SecureShellLink`Private`stdinStream, SecureShellLink`Private`stdoutStream, SecureShellLink`Private`stdError, SecureShellLink`Private`triedUser, SecureShellLink`Private`rememberMe, SecureShellLink`Private`pem, SecureShellLink`Private`pemPassword, SecureShellLink`Private`tryPemWithPass, SecureShellLink`Private`tryPemWithAll}, SecureShellLink`Private`auths = OptionValue[Authentication]; SecureShellLink`Private`cacheAuth = TrueQ[OptionValue[RemoteAuthorizationCaching]]; {SecureShellLink`Private`username, SecureShellLink`Private`password} = SecureShellLink`Private`resolveUserPass[SecureShellLink`Private`userhost, SecureShellLink`Private`userpass, SecureShellLink`Private`pass, SecureShellLink`Private`auths]; SecureShellLink`Private`hostname = SecureShellLink`Private`getHost[SecureShellLink`Private`userhost]; {SecureShellLink`Private`username, SecureShellLink`Private`hostname} = SecureShellLink`Private`checkSSHConfig[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; SecureShellLink`Private`index = SecureShellLink`Private`sshInit[SecureShellLink`Private`hostname]; If[SecureShellLink`Private`index < 0, If[SecureShellLink`Private`index === -3, Message[RemoteConnect::addr, SecureShellLink`Private`hostname], Message[RemoteConnect::init]]; Return[$Failed]]; SecureShellLink`Private`pem = Lookup[SecureShellLink`Private`auths, "SSHKey"]; If[ !MissingQ[SecureShellLink`Private`pem], SecureShellLink`Private`pemPassword = Lookup[SecureShellLink`Private`auths, "SSHKeyPassword", ""]; SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem_] := Function[SecureShellLink`Private`singlePass, Block[{SecureShellLink`Private`passData = SecureShellLink`Private`singlePass}, If[SecureShellLink`Private`authenticated > 0, Return[]]; If[SecureShellLink`Private`passData === None, SecureShellLink`Private`passData = ""]; If[MatchQ[SecureShellLink`Private`passData, File[_String, ___]], If[FileExistsQ[First[SecureShellLink`Private`passData]], SecureShellLink`Private`passData = StringTrim[ReadString[SecureShellLink`Private`passData]]; ]; ]; If[StringQ[SecureShellLink`Private`passData], Which[MatchQ[SecureShellLink`Private`singlePem, _File], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyFile[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem[[1]], SecureShellLink`Private`passData], StringQ[SecureShellLink`Private`singlePem], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyData[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem, SecureShellLink`Private`passData]]]]]; SecureShellLink`Private`tryPemWithAll = Function[SecureShellLink`Private`singlePem, Which[ListQ[SecureShellLink`Private`pemPassword], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem] /@ SecureShellLink`Private`pemPassword, MatchQ[SecureShellLink`Private`pemPassword, _String | File[_String, ___]], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem][SecureShellLink`Private`pemPassword]]]; Which[ListQ[SecureShellLink`Private`pem], SecureShellLink`Private`tryPemWithAll /@ SecureShellLink`Private`pem, MatchQ[SecureShellLink`Private`pem, _String | _File], SecureShellLink`Private`tryPemWithAll[SecureShellLink`Private`pem]]]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= "", SecureShellLink`Private`triedUser = SecureShellLink`Private`username; SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0 && (SecureShellLink`Private`username === "" || SecureShellLink`Private`password === ""), SecureShellLink`Private`result = SecureShellLink`Private`loginDialog[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; If[MatchQ[SecureShellLink`Private`result, {_String, _String, _}], {SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`rememberMe} = SecureShellLink`Private`result, Message[RemoteConnect::noAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheAuth = SecureShellLink`Private`rememberMe || SecureShellLink`Private`cacheAuth]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= SecureShellLink`Private`triedUser, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0, If[SecureShellLink`Private`cacheAuth, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticateSaveKey[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`$keyDirectory], SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password]]; ]; If[SecureShellLink`Private`authenticated <= 0, Message[RemoteConnect::invAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheName[SecureShellLink`Private`hostname, SecureShellLink`Private`username]; If[SecureShellLink`Private`sshShellInit[SecureShellLink`Private`index] <= 0, Message[RemoteConnect::cnct]; Return[$Failed]; ]; SecureShellLink`Private`uuid = CreateUUID[]; SecureShellLink`Private`$RemoteUUIDTable[SecureShellLink`Private`uuid] = SecureShellLink`Private`index; SecureShellLink`Private`stdoutStream = OpenRead[StringJoin["stdout-", SecureShellLink`Private`uuid], Method -> "RemoteConnection", BinaryFormat -> True, AppendCheck -> True]; SecureShellLink`Private`stderrStream = OpenRead[StringJoin["stderr-", SecureShellLink`Private`uuid], Method -> "RemoteConnection", BinaryFormat -> True, AppendCheck -> True]; SecureShellLink`Private`stdinStream = OpenWrite[StringJoin["stdin-", SecureShellLink`Private`uuid], Method -> "RemoteConnection", BinaryFormat -> True]; RemoteConnectionObject[Association["Host" -> SecureShellLink`Private`hostname, "Username" -> SecureShellLink`Private`username, "UUID" -> SecureShellLink`Private`uuid, "StandardOutput" -> SecureShellLink`Private`stdoutStream, "StandardInput" -> SecureShellLink`Private`stdinStream, "StandardError" -> SecureShellLink`Private`stderrStream]]]
 * Definitions:      System`Private`LHS$_RemoteConnect := RuleCondition[Developer`CheckArgumentCount[System`Private`LHS$, 1, 3]; Fail]
 * 
 * Own values:       None
 * 
 *                   RemoteConnect[(SecureShellLink`Private`userhost_)?SecureShellLink`Private`validUserHostQ, SecureShellLink`Private`userpass_String:"", SecureShellLink`Private`pass_String:"", SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`auths, SecureShellLink`Private`username = "", SecureShellLink`Private`password = "", SecureShellLink`Private`result, SecureShellLink`Private`index, SecureShellLink`Private`hostname, SecureShellLink`Private`authenticated = -1, SecureShellLink`Private`cacheAuth, SecureShellLink`Private`uuid, SecureShellLink`Private`stdinStream, SecureShellLink`Private`stdoutStream, SecureShellLink`Private`stdError, SecureShellLink`Private`triedUser, SecureShellLink`Private`rememberMe, SecureShellLink`Private`pem, SecureShellLink`Private`pemPassword, SecureShellLink`Private`tryPemWithPass, SecureShellLink`Private`tryPemWithAll}, SecureShellLink`Private`auths = OptionValue[Authentication]; SecureShellLink`Private`cacheAuth = TrueQ[OptionValue[RemoteAuthorizationCaching]]; {SecureShellLink`Private`username, SecureShellLink`Private`password} = SecureShellLink`Private`resolveUserPass[SecureShellLink`Private`userhost, SecureShellLink`Private`userpass, SecureShellLink`Private`pass, SecureShellLink`Private`auths]; SecureShellLink`Private`hostname = SecureShellLink`Private`getHost[SecureShellLink`Private`userhost]; {SecureShellLink`Private`username, SecureShellLink`Private`hostname} = SecureShellLink`Private`checkSSHConfig[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; SecureShellLink`Private`index = SecureShellLink`Private`sshInit[SecureShellLink`Private`hostname]; If[SecureShellLink`Private`index < 0, If[SecureShellLink`Private`index === -3, Message[RemoteConnect::addr, SecureShellLink`Private`hostname], Message[RemoteConnect::init]]; Return[$Failed]]; SecureShellLink`Private`pem = Lookup[SecureShellLink`Private`auths, "SSHKey"]; If[ !MissingQ[SecureShellLink`Private`pem], SecureShellLink`Private`pemPassword = Lookup[SecureShellLink`Private`auths, "SSHKeyPassword", ""]; SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem_] := Function[SecureShellLink`Private`singlePass, Block[{SecureShellLink`Private`passData = SecureShellLink`Private`singlePass}, If[SecureShellLink`Private`authenticated > 0, Return[]]; If[SecureShellLink`Private`passData === None, SecureShellLink`Private`passData = ""]; If[MatchQ[SecureShellLink`Private`passData, File[_String, ___]], If[FileExistsQ[First[SecureShellLink`Private`passData]], SecureShellLink`Private`passData = StringTrim[ReadString[SecureShellLink`Private`passData]]; ]; ]; If[StringQ[SecureShellLink`Private`passData], Which[MatchQ[SecureShellLink`Private`singlePem, _File], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyFile[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem[[1]], SecureShellLink`Private`passData], StringQ[SecureShellLink`Private`singlePem], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyData[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem, SecureShellLink`Private`passData]]]]]; SecureShellLink`Private`tryPemWithAll = Function[SecureShellLink`Private`singlePem, Which[ListQ[SecureShellLink`Private`pemPassword], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem] /@ SecureShellLink`Private`pemPassword, MatchQ[SecureShellLink`Private`pemPassword, _String | File[_String, ___]], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem][SecureShellLink`Private`pemPassword]]]; Which[ListQ[SecureShellLink`Private`pem], SecureShellLink`Private`tryPemWithAll /@ SecureShellLink`Private`pem, MatchQ[SecureShellLink`Private`pem, _String | _File], SecureShellLink`Private`tryPemWithAll[SecureShellLink`Private`pem]]]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= "", SecureShellLink`Private`triedUser = SecureShellLink`Private`username; SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0 && (SecureShellLink`Private`username === "" || SecureShellLink`Private`password === ""), SecureShellLink`Private`result = SecureShellLink`Private`loginDialog[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; If[MatchQ[SecureShellLink`Private`result, {_String, _String, _}], {SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`rememberMe} = SecureShellLink`Private`result, Message[RemoteConnect::noAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheAuth = SecureShellLink`Private`rememberMe || SecureShellLink`Private`cacheAuth]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= SecureShellLink`Private`triedUser, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0, If[SecureShellLink`Private`cacheAuth, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticateSaveKey[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`$keyDirectory], SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password]]; ]; If[SecureShellLink`Private`authenticated <= 0, Message[RemoteConnect::invAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheName[SecureShellLink`Private`hostname, SecureShellLink`Private`username]; If[SecureShellLink`Private`sshShellInit[SecureShellLink`Private`index] <= 0, Message[RemoteConnect::cnct]; Return[$Failed]; ]; SecureShellLink`Private`uuid = CreateUUID[]; SecureShellLink`Private`$RemoteUUIDTable[SecureShellLink`Private`uuid] = SecureShellLink`Private`index; SecureShellLink`Private`stdoutStream = OpenRead[StringJoin["stdout-", SecureShellLink`Private`uuid], Method -> "RemoteConnection", BinaryFormat -> True, AppendCheck -> True]; SecureShellLink`Private`stderrStream = OpenRead[StringJoin["stderr-", SecureShellLink`Private`uuid], Method -> "RemoteConnection", BinaryFormat -> True, AppendCheck -> True]; SecureShellLink`Private`stdinStream = OpenWrite[StringJoin["stdin-", SecureShellLink`Private`uuid], Method -> "RemoteConnection", BinaryFormat -> True]; RemoteConnectionObject[Association["Host" -> SecureShellLink`Private`hostname, "Username" -> SecureShellLink`Private`username, "UUID" -> SecureShellLink`Private`uuid, "StandardOutput" -> SecureShellLink`Private`stdoutStream, "StandardInput" -> SecureShellLink`Private`stdinStream, "StandardError" -> SecureShellLink`Private`stderrStream]]]
 * Down values:      System`Private`LHS$_RemoteConnect := RuleCondition[Developer`CheckArgumentCount[System`Private`LHS$, 1, 3]; Fail]
 * 
 * Up values:        Internal`ArgumentCountRegistry[RemoteConnect] ^= {1, 3}
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun remoteConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoteConnect", arguments.toMutableList(), options)
}
