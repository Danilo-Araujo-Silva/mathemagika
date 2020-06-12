package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainTransactionSubmit
 *
 * Full name:        System`BlockchainTransactionSubmit
 *
 * Usage:            BlockchainTransactionSubmit[obj] submits the transaction specified in the BlockchainTransaction object obj to a blockchain.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainTransactionSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainTransactionSubmit.html
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
fun blockchainTransactionSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainTransactionSubmit", arguments.toMutableList(), options)
}
