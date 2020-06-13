package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EncryptFile
 *
 * Full name:        System`EncryptFile
 *
 *                   EncryptFile["password", file] generates an encrypted version of a file, using the specified password.
 *                   EncryptFile["password", source, target] generates an encrypted version of source, putting the result in target.
 * Usage:            EncryptFile[keyspec, source, …] encrypts using the cryptographic key specification keyspec.
 *
 *                   Method -> Automatic
 *                   OverwriteTarget -> False
 * Options:          Permissions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EncryptFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/EncryptFile.html
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
fun encryptFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EncryptFile", arguments.toMutableList(), options)
}
