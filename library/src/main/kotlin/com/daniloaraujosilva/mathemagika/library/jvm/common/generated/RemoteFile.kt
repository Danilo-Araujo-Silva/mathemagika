package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RemoteFile
 * 
 * Full name:        System`RemoteFile
 * 
 * Usage:            RemoteFile[URL["uri"]] is a symbolic representation of a file on a remote machine.
 * 
 * Options:          Authentication :> $SSHAuthentication
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RemoteFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoteFile.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 *                   CopyFile[SecureShellLink`Private`file_, HoldPattern[SecureShellLink`Private`url_RemoteFile], SecureShellLink`Private`opts:OptionsPattern[]] ^:= SecureShellLink`RemoteCopyFile[SecureShellLink`Private`file, SecureShellLink`Private`url, SecureShellLink`Private`opts]
 * Up values:        CopyFile[HoldPattern[SecureShellLink`Private`url_RemoteFile], SecureShellLink`Private`file_, SecureShellLink`Private`opts:OptionsPattern[]] ^:= SecureShellLink`RemoteCopyFile[SecureShellLink`Private`url, SecureShellLink`Private`file, SecureShellLink`Private`opts]
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun remoteFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoteFile", arguments.toMutableList(), options)
}
