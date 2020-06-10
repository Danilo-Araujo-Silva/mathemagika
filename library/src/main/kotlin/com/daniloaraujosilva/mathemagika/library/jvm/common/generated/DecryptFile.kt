package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DecryptFile
 * 
 * Full name:        System`DecryptFile
 * 
 *                   DecryptFile["password", file] generates a decrypted version of a file, using the specified password.
 *                   DecryptFile["password", source, target] generates a decrypted version of source, putting the result in target.
 * Usage:            DecryptFile[keyspec, source, …] decrypts using the cryptographic key specification keyspec.
 * 
 *                   OverwriteTarget -> False
 * Options:          Permissions -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DecryptFile
 * Documentation:    web: http://reference.wolfram.com/language/ref/DecryptFile.html
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
fun decryptFile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DecryptFile", arguments.toMutableList(), options)
}
