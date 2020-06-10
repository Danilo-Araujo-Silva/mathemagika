package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BlockchainTransactionData
 * 
 * Full name:        System`BlockchainTransactionData
 * 
 *                   BlockchainTransactionData[txid] gives information about the blockchain transaction with ID txid on the blockchain specified by $BlockchainBase.
 * Usage:            BlockchainTransactionData[txid, prop] gives the specified property of the transaction.
 * 
 * Options:          BlockchainBase :> $BlockchainBase
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BlockchainTransactionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainTransactionData.html
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
fun blockchainTransactionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainTransactionData", arguments.toMutableList(), options)
}
