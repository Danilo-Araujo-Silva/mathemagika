package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateAsymmetricKeyPair
 *
 * Full name:        System`GenerateAsymmetricKeyPair
 *
 *                   GenerateAsymmetricKeyPair[] randomly generates a PrivateKey and corresponding PublicKey object for use with public-key cryptographic functions.
 *                   GenerateAsymmetricKeyPair["type"] randomly generates private and public keys of the specified type.
 * Usage:            GenerateAsymmetricKeyPair[opts] randomly generates keys using the specified options.
 *
 * Options:          Method -> RSA
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenerateAsymmetricKeyPair
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateAsymmetricKeyPair.html
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
fun generateAsymmetricKeyPair(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateAsymmetricKeyPair", arguments.toMutableList(), options)
}
