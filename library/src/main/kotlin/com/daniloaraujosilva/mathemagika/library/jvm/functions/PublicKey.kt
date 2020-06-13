package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PublicKey
 *
 * Full name:        System`PublicKey
 *
 *                   PublicKey[assoc] represents the public part of a key pair for a public-key cryptographic system.
 * Usage:            PublicKey[PrivateKey[…]] creates a matching public key for the given private key.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PublicKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/PublicKey.html
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
fun publicKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PublicKey", arguments.toMutableList(), options)
}
