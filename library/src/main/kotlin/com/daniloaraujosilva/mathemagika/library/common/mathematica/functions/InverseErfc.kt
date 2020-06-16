package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseErfc
 *
 * Full name:        System`InverseErfc
 *
 * Usage:            InverseErfc[s] gives the inverse complementary error function obtained as the solution for z in s = erfc(z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseErfc
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseErfc.html
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
fun inverseErfc(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseErfc", arguments.toMutableList(), options)
}
