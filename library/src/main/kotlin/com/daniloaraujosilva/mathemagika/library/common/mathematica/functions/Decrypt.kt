package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Decrypt
 *
 * Full name:        System`Decrypt
 *
 *                   Decrypt["password", enc] attempts to decrypt the encrypted object enc using the specified password.
 *                   Decrypt[keyspec, enc] attempts to decrypt using the cryptographic key specification keyspec.
 *                   Decrypt[key, bytes] attempts to decrypt the ByteArray object bytes, to give another ByteArray object.
 * Usage:            Decrypt[obj] interactively requests a password with which to try to decrypt obj.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Decrypt
 * Documentation:    web: http://reference.wolfram.com/language/ref/Decrypt.html
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
fun decrypt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Decrypt", arguments.toMutableList(), options)
}
