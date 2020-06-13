package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoteConnectionObject
 *
 * Full name:        System`RemoteConnectionObject
 *
 * Usage:            RemoteConnectionObject[…] is an object that represents a remote connection.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoteConnectionObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoteConnectionObject.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 *                   DeleteObject[SecureShellLink`Private`ro:RemoteConnectionObject[SecureShellLink`Private`assoc_Association]] ^:= Block[{SecureShellLink`Private`index = SecureShellLink`Private`$RemoteUUIDTable[SecureShellLink`Private`assoc["UUID"]]}, If[ !NumberQ[SecureShellLink`Private`index] || SecureShellLink`Private`index < 0, Message[DeleteObject::nim, SecureShellLink`Private`ro]; Return[$Failed]]; Close[SecureShellLink`Private`assoc["StandardOutput"]]; Close[SecureShellLink`Private`assoc["StandardInput"]]; Close[SecureShellLink`Private`assoc["StandardError"]]; SecureShellLink`Private`sshClose[SecureShellLink`Private`index]; KeyDropFrom[SecureShellLink`Private`$RemoteUUIDTable, SecureShellLink`Private`assoc["UUID"]]; ]
 *                   WriteLine[RemoteConnectionObject[SecureShellLink`Private`assoc_Association] /; KeyExistsQ[SecureShellLink`Private`assoc["UUID"]][SecureShellLink`Private`$RemoteUUIDTable], SecureShellLink`Private`args___] ^:= WriteLine[SecureShellLink`Private`assoc["StandardInput"], SecureShellLink`Private`args]
 *                   WriteString[RemoteConnectionObject[SecureShellLink`Private`assoc_Association] /; KeyExistsQ[SecureShellLink`Private`assoc["UUID"]][SecureShellLink`Private`$RemoteUUIDTable], SecureShellLink`Private`args___] ^:= WriteString[SecureShellLink`Private`assoc["StandardInput"], SecureShellLink`Private`args]
 *                   Write[RemoteConnectionObject[SecureShellLink`Private`assoc_Association] /; KeyExistsQ[SecureShellLink`Private`assoc["UUID"]][SecureShellLink`Private`$RemoteUUIDTable], SecureShellLink`Private`args___] ^:= Write[SecureShellLink`Private`assoc["StandardInput"], SecureShellLink`Private`args]
 *                   Read[RemoteConnectionObject[SecureShellLink`Private`assoc_Association] /; KeyExistsQ[SecureShellLink`Private`assoc["UUID"]][SecureShellLink`Private`$RemoteUUIDTable], SecureShellLink`Private`args___] ^:= Read[SecureShellLink`Private`assoc["StandardOutput"], SecureShellLink`Private`args]
 *                   ReadString[RemoteConnectionObject[SecureShellLink`Private`assoc_Association] /; KeyExistsQ[SecureShellLink`Private`assoc["UUID"]][SecureShellLink`Private`$RemoteUUIDTable], SecureShellLink`Private`args___] ^:= ReadString[SecureShellLink`Private`assoc["StandardOutput"], SecureShellLink`Private`args]
 * Up values:        ReadLine[RemoteConnectionObject[SecureShellLink`Private`assoc_Association] /; KeyExistsQ[SecureShellLink`Private`assoc["UUID"]][SecureShellLink`Private`$RemoteUUIDTable], SecureShellLink`Private`args___] ^:= ReadLine[SecureShellLink`Private`assoc["StandardOutput"], SecureShellLink`Private`args]
 *
 *                   RemoteConnectionObject[SecureShellLink`Private`assoc_Association]["Properties"] := Keys[SecureShellLink`Private`assoc]
 * Sub values:       RemoteConnectionObject[SecureShellLink`Private`assoc_Association][SecureShellLink`Private`key_] := SecureShellLink`Private`assoc[SecureShellLink`Private`key]
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun remoteConnectionObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoteConnectionObject", arguments.toMutableList(), options)
}
