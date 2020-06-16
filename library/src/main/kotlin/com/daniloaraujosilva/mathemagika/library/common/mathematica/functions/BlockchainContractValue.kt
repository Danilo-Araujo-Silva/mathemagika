package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainContractValue
 *
 * Full name:        System`BlockchainContractValue
 *
 *                   BlockchainContractValue[caddr] gets the result obtained from a Wolfram expression contract at blockchain address caddr.
 *                   BlockchainContractValue[caddr, prop] gets the property prop of the result obtained from a Wolfram expression contract with address caddr.
 *                   BlockchainContractValue[caddr, func] calls the function func of a contract with address caddr.
 * Usage:            BlockchainContractValue[caddr, assoc] calls a contract with address caddr with the properties defined in Association assoc.
 *
 * Options:          BlockchainBase :> $BlockchainBase
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainContractValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainContractValue.html
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
fun blockchainContractValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainContractValue", arguments.toMutableList(), options)
}
