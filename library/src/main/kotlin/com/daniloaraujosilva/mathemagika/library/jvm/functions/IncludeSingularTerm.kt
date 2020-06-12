package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeSingularTerm
 *
 * Full name:        System`IncludeSingularTerm
 *
 *                                                                                                                                     2 -s/2
 * Usage:            IncludeSingularTerm is an option for LerchPhi and Zeta. With IncludeSingularTerm -> True, terms involving ((k + a) )     with k + a == 0 are included. With IncludeSingularTerm -> False, they are not.
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
fun includeSingularTerm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeSingularTerm", arguments.toMutableList(), options)
}
