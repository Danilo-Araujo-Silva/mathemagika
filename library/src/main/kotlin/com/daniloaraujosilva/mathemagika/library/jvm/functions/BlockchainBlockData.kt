package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainBlockData
 *
 * Full name:        System`BlockchainBlockData
 *
 *                   BlockchainBlockData["hash"] gives information about the block with the specified hash on the blockchain specified by $BlockchainBase.
 *                   BlockchainBlockData[n] gives information about block n on the blockchain.
 *                   BlockchainBlockData[-n] gives information about the block n elements from the end of the blockchain.
 * Usage:            BlockchainBlockData[bspec, prop] gives the specified property of the block.
 *
 * Options:          BlockchainBase :> $BlockchainBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainBlockData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainBlockData.html
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
fun blockchainBlockData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainBlockData", arguments.toMutableList(), options)
}
