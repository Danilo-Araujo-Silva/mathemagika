package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NevilleThetaD
 *
 * Full name:        System`NevilleThetaD
 *
 *                   NevilleThetaD[z, m] gives the Neville theta function ϑ  (z  m).
 * Usage:                                                                  d
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NevilleThetaD
 * Documentation:    web: http://reference.wolfram.com/language/ref/NevilleThetaD.html
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
fun nevilleThetaD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NevilleThetaD", arguments.toMutableList(), options)
}
