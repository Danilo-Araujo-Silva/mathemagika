package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainPut
 *
 * Full name:        System`BlockchainPut
 *
 * Usage:            BlockchainPut[expr] adds expr to the Wolfram blockchain.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainPut
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainPut.html
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
fun blockchainPut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainPut", arguments.toMutableList(), options)
}
