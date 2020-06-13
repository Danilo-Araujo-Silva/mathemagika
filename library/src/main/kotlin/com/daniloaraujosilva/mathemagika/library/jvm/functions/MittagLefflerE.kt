package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MittagLefflerE
 *
 * Full name:        System`MittagLefflerE
 *
 *                   MittagLefflerE[α, z] gives the Mittag–Leffler function E (z).
 *                                                                           α
 *                   MittagLefflerE[α, β, z] gives the generalized Mittag–Leffler function E    (z).
 * Usage:                                                                                   α, β
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MittagLefflerE
 * Documentation:    web: http://reference.wolfram.com/language/ref/MittagLefflerE.html
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
fun mittagLefflerE(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MittagLefflerE", arguments.toMutableList(), options)
}
