package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainData
 *
 * Full name:        System`BlockchainData
 *
 *                   BlockchainData[] gives information about the blockchain specified by $BlockchainBase.
 * Usage:            BlockchainData[property] gives the value of the specified property of the blockchain.
 *
 * Options:          BlockchainBase :> $BlockchainBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainData.html
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
fun blockchainData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainData", arguments.toMutableList(), options)
}
