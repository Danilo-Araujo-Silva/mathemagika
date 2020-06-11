package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainTransaction
 *
 * Full name:        System`BlockchainTransaction
 *
 * Usage:            BlockchainTransaction[assoc] represents a blockchain transaction built from the components in the association assoc.
 *
 * Options:          BlockchainBase :> $BlockchainBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainTransaction
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainTransaction.html
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
fun blockchainTransaction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainTransaction", arguments.toMutableList(), options)
}
