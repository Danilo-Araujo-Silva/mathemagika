package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateSymmetricKey
 *
 * Full name:        System`GenerateSymmetricKey
 *
 *                   GenerateSymmetricKey[] randomly generates a SymmetricKey object suitable for use with cryptographic functions.
 *                   GenerateSymmetricKey["password"] derives a SymmetricKey object from the password string given.
 *                   GenerateSymmetricKey[bytes] generates a SymmetricKey object using the byte array or list of bytes directly as the key.
 *                   GenerateSymmetricKey[DerivedKey[…]] generates a symmetric key object with a key given by the DerivedKey object.
 * Usage:            GenerateSymmetricKey[opts] randomly generates a symmetric key using the specified options.
 *
 * Options:          Method -> AES256
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenerateSymmetricKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateSymmetricKey.html
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
fun generateSymmetricKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateSymmetricKey", arguments.toMutableList(), options)
}
