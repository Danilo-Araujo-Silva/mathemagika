package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainGet
 *
 * Full name:        System`BlockchainGet
 *
 * Usage:            BlockchainGet[id] retrieves data from the Wolfram blockchain for the transaction with the specified ID.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainGet
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainGet.html
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
fun blockchainGet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainGet", arguments.toMutableList(), options)
}
