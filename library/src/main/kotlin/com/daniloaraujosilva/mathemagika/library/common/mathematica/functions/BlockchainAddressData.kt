package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainAddressData
 *
 * Full name:        System`BlockchainAddressData
 *
 *                   BlockchainAddressData["address"] gives available information connected with the specified address on the default blockchain.
 *                   BlockchainAddressData[assoc] gives available information connected with properties matching the specification in assoc.
 * Usage:            BlockchainAddressData[addressSpec, prop] gives the specified property of the blockchain address.
 *
 *                   BlockchainBase :> $BlockchainBase
 * Options:          MaxItems -> 20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainAddressData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainAddressData.html
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
fun blockchainAddressData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainAddressData", arguments.toMutableList(), options)
}
