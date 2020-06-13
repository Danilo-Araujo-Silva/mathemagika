package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoteRunProcess
 *
 * Full name:        System`RemoteRunProcess
 *
 *                   RemoteRunProcess["host", "command"] runs the specified system command on the remote host, returning information on the outcome.
 *                   RemoteRunProcess[IPAddress["address"], "command"] runs the command on the machine with the specified IP address.
 *                   RemoteRunProcess[obj, "command"] run the command on the remote host specified by the RemoteConnectionObject obj.
 *                   RemoteRunProcess["host", {"command", arg , arg , …}] runs the specified command, with command-line arguments arg .
 *                                                           1     2                                                                 i
 *                   RemoteRunProcess["host", command, "prop"] returns only the specified property.
 * Usage:            RemoteRunProcess["host", command, prop, input] feeds the specified initial input to the command.
 *
 *                   Authentication :> $SSHAuthentication
 * Options:          RemoteAuthorizationCaching -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoteRunProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoteRunProcess.html
 *
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_, SecureShellLink`Private`opts:OptionsPattern[]] := RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`commands, All, SecureShellLink`Private`opts]
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_, All, SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`joinedCommands}, If[ListQ[SecureShellLink`Private`commands], SecureShellLink`Private`joinedCommands = StringRiffle[ToString /@ SecureShellLink`Private`commands, " "]; , SecureShellLink`Private`joinedCommands = ToString[SecureShellLink`Private`commands]; ]; RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`joinedCommands, All, "", SecureShellLink`Private`opts]]
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_, SecureShellLink`Private`outputType:"StandardOutput" | "StandardError" | "ExitCode", SecureShellLink`Private`input:Except[OptionsPattern[]]:"", SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`result, SecureShellLink`Private`joinedCommands, SecureShellLink`Private`stringInput}, If[ListQ[SecureShellLink`Private`commands], SecureShellLink`Private`joinedCommands = StringRiffle[ToString /@ SecureShellLink`Private`commands, " "]; , SecureShellLink`Private`joinedCommands = ToString[SecureShellLink`Private`commands]; ]; SecureShellLink`Private`stringInput = ToString[SecureShellLink`Private`input]; SecureShellLink`Private`result = RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`joinedCommands, All, SecureShellLink`Private`stringInput, SecureShellLink`Private`opts]; If[AssociationQ[SecureShellLink`Private`result], SecureShellLink`Private`result = SecureShellLink`Private`result[SecureShellLink`Private`outputType]]; If[StringQ[SecureShellLink`Private`result] || IntegerQ[SecureShellLink`Private`result], SecureShellLink`Private`result, $Failed]]
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_List, All, SecureShellLink`Private`input:Except[OptionsPattern[]], SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`joinedCommands, SecureShellLink`Private`stringInput}, SecureShellLink`Private`joinedCommands = StringRiffle[ToString /@ SecureShellLink`Private`commands, " "]; SecureShellLink`Private`stringInput = ToString[SecureShellLink`Private`input]; RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`joinedCommands, All, SecureShellLink`Private`stringInput, SecureShellLink`Private`opts]]
 *                   RemoteRunProcess[SecureShellLink`Private`userhost:_String | _IPAddress | _URL, SecureShellLink`Private`command_String, All, SecureShellLink`Private`input_String, SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`hostname, SecureShellLink`Private`auths, SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`result, SecureShellLink`Private`stdout, SecureShellLink`Private`stderr, SecureShellLink`Private`eCode, SecureShellLink`Private`index = -1, SecureShellLink`Private`authenticated = 0, SecureShellLink`Private`cacheAuth, SecureShellLink`Private`triedUser, SecureShellLink`Private`commandInput = SecureShellLink`Private`command, SecureShellLink`Private`rememberMe, SecureShellLink`Private`pem, SecureShellLink`Private`pemPassword, SecureShellLink`Private`tryPemWithPass, SecureShellLink`Private`tryPemWithAll}, SecureShellLink`Private`auths = OptionValue[Authentication]; SecureShellLink`Private`cacheAuth = TrueQ[OptionValue[RemoteAuthorizationCaching]]; {SecureShellLink`Private`username, SecureShellLink`Private`password} = SecureShellLink`Private`resolveUserPass[SecureShellLink`Private`userhost, "", "", SecureShellLink`Private`auths]; SecureShellLink`Private`hostname = SecureShellLink`Private`getHost[SecureShellLink`Private`userhost]; {SecureShellLink`Private`username, SecureShellLink`Private`hostname} = SecureShellLink`Private`checkSSHConfig[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; SecureShellLink`Private`index = SecureShellLink`Private`sshInit[SecureShellLink`Private`hostname]; If[SecureShellLink`Private`index < 0, If[SecureShellLink`Private`index === -3, Message[RemoteRunProcess::addr, SecureShellLink`Private`hostname], Message[RemoteRunProcess::init]]; Return[$Failed]]; SecureShellLink`Private`pem = Lookup[SecureShellLink`Private`auths, "SSHKey"]; If[ !MissingQ[SecureShellLink`Private`pem], SecureShellLink`Private`pemPassword = Lookup[SecureShellLink`Private`auths, "SSHKeyPassword", ""]; SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem_] := Function[SecureShellLink`Private`singlePass, Block[{SecureShellLink`Private`passData = SecureShellLink`Private`singlePass}, If[SecureShellLink`Private`authenticated > 0, Return[]]; If[SecureShellLink`Private`passData === None, SecureShellLink`Private`passData = ""]; If[MatchQ[SecureShellLink`Private`passData, File[_String, ___]], If[FileExistsQ[First[SecureShellLink`Private`passData]], SecureShellLink`Private`passData = StringTrim[ReadString[SecureShellLink`Private`passData]]; ]; ]; If[StringQ[SecureShellLink`Private`passData], Which[MatchQ[SecureShellLink`Private`singlePem, _File], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyFile[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem[[1]], SecureShellLink`Private`passData], StringQ[SecureShellLink`Private`singlePem], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyData[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem, SecureShellLink`Private`passData]]]]]; SecureShellLink`Private`tryPemWithAll = Function[SecureShellLink`Private`singlePem, Which[ListQ[SecureShellLink`Private`pemPassword], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem] /@ SecureShellLink`Private`pemPassword, MatchQ[SecureShellLink`Private`pemPassword, _String | File[_String, ___]], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem][SecureShellLink`Private`pemPassword]]]; Which[ListQ[SecureShellLink`Private`pem], SecureShellLink`Private`tryPemWithAll /@ SecureShellLink`Private`pem, MatchQ[SecureShellLink`Private`pem, _String | _File], SecureShellLink`Private`tryPemWithAll[SecureShellLink`Private`pem]]]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= "", SecureShellLink`Private`triedUser = SecureShellLink`Private`username; SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0 && (SecureShellLink`Private`username === "" || SecureShellLink`Private`password === ""), SecureShellLink`Private`result = SecureShellLink`Private`loginDialog[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; If[MatchQ[SecureShellLink`Private`result, {_String, _String, _}], {SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`rememberMe} = SecureShellLink`Private`result, Message[RemoteRunProcess::noAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheAuth = SecureShellLink`Private`rememberMe || SecureShellLink`Private`cacheAuth]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= SecureShellLink`Private`triedUser, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0, If[SecureShellLink`Private`cacheAuth, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticateSaveKey[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`$keyDirectory], SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password]]]; If[SecureShellLink`Private`authenticated <= 0, Message[RemoteRunProcess::invAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheName[SecureShellLink`Private`hostname, SecureShellLink`Private`username]; If[SecureShellLink`Private`sshShellInit[SecureShellLink`Private`index] <= 0, Message[RemoteRunProcess::cnct]; Return[$Failed]; ]; If[SecureShellLink`Private`input =!= "", If[StringContainsQ[SecureShellLink`Private`command, "<"] || StringContainsQ[SecureShellLink`Private`command, "|"], Message[RemoteRunProcess::pipe], SecureShellLink`Private`commandInput = StringJoin[SecureShellLink`Private`command, " <<'EOF_MARKER'\n", SecureShellLink`Private`input, "\nEOF_MARKER"]]]; SecureShellLink`Private`stdout = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshEvaluate, SecureShellLink`Private`index, SecureShellLink`Private`commandInput]; If[ !MatchQ[SecureShellLink`Private`stdout, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stdout = FromCharacterCode[Normal[SecureShellLink`Private`stdout]]; SecureShellLink`Private`stderr = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshStderr, SecureShellLink`Private`index]; If[ !MatchQ[SecureShellLink`Private`stderr, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stderr = FromCharacterCode[Normal[SecureShellLink`Private`stderr]]; SecureShellLink`Private`eCode = SecureShellLink`Private`sshReturnCode[SecureShellLink`Private`index]; If[ !IntegerQ[SecureShellLink`Private`eCode] || SecureShellLink`Private`eCode < 0, SecureShellLink`Private`eCode = Missing[]]; SecureShellLink`Private`sshClose[SecureShellLink`Private`index]; Association["ExitCode" -> SecureShellLink`Private`eCode, "StandardOutput" -> SecureShellLink`Private`stdout, "StandardError" -> SecureShellLink`Private`stderr]]
 *                   RemoteRunProcess[SecureShellLink`Private`ro:RemoteConnectionObject[SecureShellLink`Private`param_], SecureShellLink`Private`command_String, All, SecureShellLink`Private`input_String, SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`result, SecureShellLink`Private`index, SecureShellLink`Private`stdout, SecureShellLink`Private`stderr, SecureShellLink`Private`eCode, SecureShellLink`Private`commandInput = SecureShellLink`Private`command}, SecureShellLink`Private`index = SecureShellLink`Private`$RemoteUUIDTable[SecureShellLink`Private`param["UUID"]]; If[ !NumberQ[SecureShellLink`Private`index], Message[RemoteRunProcess::invl]; Return[$Failed]]; If[SecureShellLink`Private`input =!= "", If[StringContainsQ[SecureShellLink`Private`command, "<"] || StringContainsQ[SecureShellLink`Private`command, "|"], Message[RemoteRunProcess::pipe], SecureShellLink`Private`commandInput = StringJoin[SecureShellLink`Private`command, " <<'EOF_MARKER'\n", SecureShellLink`Private`input, "\nEOF_MARKER"]]]; SecureShellLink`Private`stdout = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshEvaluate, SecureShellLink`Private`index, SecureShellLink`Private`commandInput]; If[ !MatchQ[SecureShellLink`Private`stdout, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stdout = FromCharacterCode[Normal[SecureShellLink`Private`stdout]]; SecureShellLink`Private`stderr = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshStderr, SecureShellLink`Private`index]; If[ !MatchQ[SecureShellLink`Private`stderr, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stderr = FromCharacterCode[Normal[SecureShellLink`Private`stderr]]; SecureShellLink`Private`eCode = SecureShellLink`Private`sshReturnCode[SecureShellLink`Private`index]; If[ !IntegerQ[SecureShellLink`Private`eCode] || SecureShellLink`Private`eCode < 0, SecureShellLink`Private`eCode = Missing[]]; Association["ExitCode" -> SecureShellLink`Private`eCode, "StandardOutput" -> SecureShellLink`Private`stdout, "StandardError" -> SecureShellLink`Private`stderr]]
 * Definitions:      System`Private`LHS$_RemoteRunProcess := RuleCondition[Developer`CheckArgumentCount[System`Private`LHS$, 2, 4]; Fail]
 *
 * Own values:       None
 *
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_, SecureShellLink`Private`opts:OptionsPattern[]] := RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`commands, All, SecureShellLink`Private`opts]
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_, All, SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`joinedCommands}, If[ListQ[SecureShellLink`Private`commands], SecureShellLink`Private`joinedCommands = StringRiffle[ToString /@ SecureShellLink`Private`commands, " "]; , SecureShellLink`Private`joinedCommands = ToString[SecureShellLink`Private`commands]; ]; RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`joinedCommands, All, "", SecureShellLink`Private`opts]]
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_, SecureShellLink`Private`outputType:"StandardOutput" | "StandardError" | "ExitCode", SecureShellLink`Private`input:Except[OptionsPattern[]]:"", SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`result, SecureShellLink`Private`joinedCommands, SecureShellLink`Private`stringInput}, If[ListQ[SecureShellLink`Private`commands], SecureShellLink`Private`joinedCommands = StringRiffle[ToString /@ SecureShellLink`Private`commands, " "]; , SecureShellLink`Private`joinedCommands = ToString[SecureShellLink`Private`commands]; ]; SecureShellLink`Private`stringInput = ToString[SecureShellLink`Private`input]; SecureShellLink`Private`result = RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`joinedCommands, All, SecureShellLink`Private`stringInput, SecureShellLink`Private`opts]; If[AssociationQ[SecureShellLink`Private`result], SecureShellLink`Private`result = SecureShellLink`Private`result[SecureShellLink`Private`outputType]]; If[StringQ[SecureShellLink`Private`result] || IntegerQ[SecureShellLink`Private`result], SecureShellLink`Private`result, $Failed]]
 *                   RemoteRunProcess[SecureShellLink`Private`host:_RemoteConnectionObject | _String | _IPAddress | _URL, SecureShellLink`Private`commands_List, All, SecureShellLink`Private`input:Except[OptionsPattern[]], SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`joinedCommands, SecureShellLink`Private`stringInput}, SecureShellLink`Private`joinedCommands = StringRiffle[ToString /@ SecureShellLink`Private`commands, " "]; SecureShellLink`Private`stringInput = ToString[SecureShellLink`Private`input]; RemoteRunProcess[SecureShellLink`Private`host, SecureShellLink`Private`joinedCommands, All, SecureShellLink`Private`stringInput, SecureShellLink`Private`opts]]
 *                   RemoteRunProcess[SecureShellLink`Private`userhost:_String | _IPAddress | _URL, SecureShellLink`Private`command_String, All, SecureShellLink`Private`input_String, SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`hostname, SecureShellLink`Private`auths, SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`result, SecureShellLink`Private`stdout, SecureShellLink`Private`stderr, SecureShellLink`Private`eCode, SecureShellLink`Private`index = -1, SecureShellLink`Private`authenticated = 0, SecureShellLink`Private`cacheAuth, SecureShellLink`Private`triedUser, SecureShellLink`Private`commandInput = SecureShellLink`Private`command, SecureShellLink`Private`rememberMe, SecureShellLink`Private`pem, SecureShellLink`Private`pemPassword, SecureShellLink`Private`tryPemWithPass, SecureShellLink`Private`tryPemWithAll}, SecureShellLink`Private`auths = OptionValue[Authentication]; SecureShellLink`Private`cacheAuth = TrueQ[OptionValue[RemoteAuthorizationCaching]]; {SecureShellLink`Private`username, SecureShellLink`Private`password} = SecureShellLink`Private`resolveUserPass[SecureShellLink`Private`userhost, "", "", SecureShellLink`Private`auths]; SecureShellLink`Private`hostname = SecureShellLink`Private`getHost[SecureShellLink`Private`userhost]; {SecureShellLink`Private`username, SecureShellLink`Private`hostname} = SecureShellLink`Private`checkSSHConfig[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; SecureShellLink`Private`index = SecureShellLink`Private`sshInit[SecureShellLink`Private`hostname]; If[SecureShellLink`Private`index < 0, If[SecureShellLink`Private`index === -3, Message[RemoteRunProcess::addr, SecureShellLink`Private`hostname], Message[RemoteRunProcess::init]]; Return[$Failed]]; SecureShellLink`Private`pem = Lookup[SecureShellLink`Private`auths, "SSHKey"]; If[ !MissingQ[SecureShellLink`Private`pem], SecureShellLink`Private`pemPassword = Lookup[SecureShellLink`Private`auths, "SSHKeyPassword", ""]; SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem_] := Function[SecureShellLink`Private`singlePass, Block[{SecureShellLink`Private`passData = SecureShellLink`Private`singlePass}, If[SecureShellLink`Private`authenticated > 0, Return[]]; If[SecureShellLink`Private`passData === None, SecureShellLink`Private`passData = ""]; If[MatchQ[SecureShellLink`Private`passData, File[_String, ___]], If[FileExistsQ[First[SecureShellLink`Private`passData]], SecureShellLink`Private`passData = StringTrim[ReadString[SecureShellLink`Private`passData]]; ]; ]; If[StringQ[SecureShellLink`Private`passData], Which[MatchQ[SecureShellLink`Private`singlePem, _File], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyFile[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem[[1]], SecureShellLink`Private`passData], StringQ[SecureShellLink`Private`singlePem], SecureShellLink`Private`authenticated = SecureShellLink`Private`SSHAuthenticateKeyData[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`singlePem, SecureShellLink`Private`passData]]]]]; SecureShellLink`Private`tryPemWithAll = Function[SecureShellLink`Private`singlePem, Which[ListQ[SecureShellLink`Private`pemPassword], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem] /@ SecureShellLink`Private`pemPassword, MatchQ[SecureShellLink`Private`pemPassword, _String | File[_String, ___]], SecureShellLink`Private`tryPemWithPass[SecureShellLink`Private`singlePem][SecureShellLink`Private`pemPassword]]]; Which[ListQ[SecureShellLink`Private`pem], SecureShellLink`Private`tryPemWithAll /@ SecureShellLink`Private`pem, MatchQ[SecureShellLink`Private`pem, _String | _File], SecureShellLink`Private`tryPemWithAll[SecureShellLink`Private`pem]]]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= "", SecureShellLink`Private`triedUser = SecureShellLink`Private`username; SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0 && (SecureShellLink`Private`username === "" || SecureShellLink`Private`password === ""), SecureShellLink`Private`result = SecureShellLink`Private`loginDialog[SecureShellLink`Private`username, SecureShellLink`Private`hostname]; If[MatchQ[SecureShellLink`Private`result, {_String, _String, _}], {SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`rememberMe} = SecureShellLink`Private`result, Message[RemoteRunProcess::noAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheAuth = SecureShellLink`Private`rememberMe || SecureShellLink`Private`cacheAuth]; If[SecureShellLink`Private`authenticated <= 0 && SecureShellLink`Private`username =!= SecureShellLink`Private`triedUser, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshKeyPairAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`$keyDirectory]; ]; If[SecureShellLink`Private`authenticated <= 0, If[SecureShellLink`Private`cacheAuth, SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticateSaveKey[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password, SecureShellLink`Private`$keyDirectory], SecureShellLink`Private`authenticated = SecureShellLink`Private`sshPasswordAuthenticate[SecureShellLink`Private`index, SecureShellLink`Private`username, SecureShellLink`Private`password]]]; If[SecureShellLink`Private`authenticated <= 0, Message[RemoteRunProcess::invAuth]; Return[$Failed]; ]; SecureShellLink`Private`cacheName[SecureShellLink`Private`hostname, SecureShellLink`Private`username]; If[SecureShellLink`Private`sshShellInit[SecureShellLink`Private`index] <= 0, Message[RemoteRunProcess::cnct]; Return[$Failed]; ]; If[SecureShellLink`Private`input =!= "", If[StringContainsQ[SecureShellLink`Private`command, "<"] || StringContainsQ[SecureShellLink`Private`command, "|"], Message[RemoteRunProcess::pipe], SecureShellLink`Private`commandInput = StringJoin[SecureShellLink`Private`command, " <<'EOF_MARKER'\n", SecureShellLink`Private`input, "\nEOF_MARKER"]]]; SecureShellLink`Private`stdout = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshEvaluate, SecureShellLink`Private`index, SecureShellLink`Private`commandInput]; If[ !MatchQ[SecureShellLink`Private`stdout, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stdout = FromCharacterCode[Normal[SecureShellLink`Private`stdout]]; SecureShellLink`Private`stderr = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshStderr, SecureShellLink`Private`index]; If[ !MatchQ[SecureShellLink`Private`stderr, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stderr = FromCharacterCode[Normal[SecureShellLink`Private`stderr]]; SecureShellLink`Private`eCode = SecureShellLink`Private`sshReturnCode[SecureShellLink`Private`index]; If[ !IntegerQ[SecureShellLink`Private`eCode] || SecureShellLink`Private`eCode < 0, SecureShellLink`Private`eCode = Missing[]]; SecureShellLink`Private`sshClose[SecureShellLink`Private`index]; Association["ExitCode" -> SecureShellLink`Private`eCode, "StandardOutput" -> SecureShellLink`Private`stdout, "StandardError" -> SecureShellLink`Private`stderr]]
 *                   RemoteRunProcess[SecureShellLink`Private`ro:RemoteConnectionObject[SecureShellLink`Private`param_], SecureShellLink`Private`command_String, All, SecureShellLink`Private`input_String, SecureShellLink`Private`opts:OptionsPattern[]] := Block[{SecureShellLink`Private`result, SecureShellLink`Private`index, SecureShellLink`Private`stdout, SecureShellLink`Private`stderr, SecureShellLink`Private`eCode, SecureShellLink`Private`commandInput = SecureShellLink`Private`command}, SecureShellLink`Private`index = SecureShellLink`Private`$RemoteUUIDTable[SecureShellLink`Private`param["UUID"]]; If[ !NumberQ[SecureShellLink`Private`index], Message[RemoteRunProcess::invl]; Return[$Failed]]; If[SecureShellLink`Private`input =!= "", If[StringContainsQ[SecureShellLink`Private`command, "<"] || StringContainsQ[SecureShellLink`Private`command, "|"], Message[RemoteRunProcess::pipe], SecureShellLink`Private`commandInput = StringJoin[SecureShellLink`Private`command, " <<'EOF_MARKER'\n", SecureShellLink`Private`input, "\nEOF_MARKER"]]]; SecureShellLink`Private`stdout = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshEvaluate, SecureShellLink`Private`index, SecureShellLink`Private`commandInput]; If[ !MatchQ[SecureShellLink`Private`stdout, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stdout = FromCharacterCode[Normal[SecureShellLink`Private`stdout]]; SecureShellLink`Private`stderr = SecureShellLink`Private`checkForZeroLenNA[SecureShellLink`Private`sshStderr, SecureShellLink`Private`index]; If[ !MatchQ[SecureShellLink`Private`stderr, _NumericArray | _List], Message[RemoteRunProcess::invl]; Return[$Failed]]; SecureShellLink`Private`stderr = FromCharacterCode[Normal[SecureShellLink`Private`stderr]]; SecureShellLink`Private`eCode = SecureShellLink`Private`sshReturnCode[SecureShellLink`Private`index]; If[ !IntegerQ[SecureShellLink`Private`eCode] || SecureShellLink`Private`eCode < 0, SecureShellLink`Private`eCode = Missing[]]; Association["ExitCode" -> SecureShellLink`Private`eCode, "StandardOutput" -> SecureShellLink`Private`stdout, "StandardError" -> SecureShellLink`Private`stderr]]
 * Down values:      System`Private`LHS$_RemoteRunProcess := RuleCondition[Developer`CheckArgumentCount[System`Private`LHS$, 2, 4]; Fail]
 *
 * Up values:        Internal`ArgumentCountRegistry[RemoteRunProcess] ^= {2, 4}
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun remoteRunProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoteRunProcess", arguments.toMutableList(), options)
}
