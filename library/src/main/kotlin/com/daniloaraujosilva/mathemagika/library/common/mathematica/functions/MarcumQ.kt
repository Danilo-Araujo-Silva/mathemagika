package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MarcumQ
 *
 * Full name:        System`MarcumQ
 *
 *                   MarcumQ[m, a, b] gives Marcum's Q function Q (a, b).
 *                                                               m
 *                   MarcumQ[m, a, b , b ] gives Marcum's Q function Q (a, b ) - Q (a, b ).
 * Usage:                           0   1                             m     0     m     1
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MarcumQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MarcumQ.html
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
fun marcumQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MarcumQ", arguments.toMutableList(), options)
}
