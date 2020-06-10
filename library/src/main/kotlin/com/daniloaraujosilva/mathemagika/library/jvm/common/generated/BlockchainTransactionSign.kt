package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BlockchainTransactionSign
 * 
 * Full name:        System`BlockchainTransactionSign
 * 
 *                   BlockchainTransactionSign[obj, key] digitally signs a blockchain transaction using the specified private key.
 *                   BlockchainTransactionSign[obj, {key , key , …}] digitally signs a transaction using all the keys key .
 * Usage:                                               1     2                                                          i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BlockchainTransactionSign
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainTransactionSign.html
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
fun blockchainTransactionSign(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainTransactionSign", arguments.toMutableList(), options)
}
