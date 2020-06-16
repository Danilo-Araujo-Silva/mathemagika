package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlockchainBase
 *
 * Full name:        System`BlockchainBase
 *
 * Usage:            BlockchainBase is an option for various blockchain functions that specifies which blockchain to use.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockchainBase
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockchainBase.html
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
fun blockchainBase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockchainBase", arguments.toMutableList(), options)
}
