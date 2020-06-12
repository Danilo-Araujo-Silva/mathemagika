package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainTokenData
 *
 * Full name:        System`BlockchainTokenData
 *
 *                   BlockchainTokenData["name"] gives information about the use of tokens with the specified name on a blockchain.
 *                   BlockchainTokenData["sym"] gives information about tokens with symbol sym.
 *                   BlockchainTokenData["address"] gives information about tokens associated with the specified address.
 *                   BlockchainTokenData[assoc] gives information about tokens with properties matching the specification in assoc.
 * Usage:            BlockchainTokenData[tokenspec, prop] gives the specified property of token usage.
 *
 *                   BlockchainBase :> $BlockchainBase
 * Options:          MaxItems -> 20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainTokenData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainTokenData.html
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
fun blockchainTokenData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainTokenData", arguments.toMutableList(), options)
}
