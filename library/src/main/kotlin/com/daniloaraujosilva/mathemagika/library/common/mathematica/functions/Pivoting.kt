package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Pivoting
 *
 * Full name:        System`Pivoting
 *
 * Usage:            Pivoting is an option to certain matrix decomposition functions. With Pivoting -> False, no pivoting is done. With Pivoting -> True, column pivoting is carried out and the list of matrices returned is augmented by the appropriate permutation matrix.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun pivoting(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pivoting", arguments.toMutableList(), options)
}
