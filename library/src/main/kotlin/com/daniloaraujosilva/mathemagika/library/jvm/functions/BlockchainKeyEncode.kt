package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainKeyEncode
 *
 * Full name:        System`BlockchainKeyEncode
 *
 * Usage:            BlockchainKeyEncode[key, form] encodes a private or public key in the specified blockchain format.
 *
 * Options:          BlockchainBase :> $BlockchainBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainKeyEncode
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainKeyEncode.html
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
fun blockchainKeyEncode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainKeyEncode", arguments.toMutableList(), options)
}
