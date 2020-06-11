package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NevilleThetaC
 *
 * Full name:        System`NevilleThetaC
 *
 *                   NevilleThetaC[z, m] gives the Neville theta function ϑ  (z  m).
 * Usage:                                                                  c
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NevilleThetaC
 * Documentation:    web: http://reference.wolfram.com/language/ref/NevilleThetaC.html
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
fun nevilleThetaC(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NevilleThetaC", arguments.toMutableList(), options)
}
