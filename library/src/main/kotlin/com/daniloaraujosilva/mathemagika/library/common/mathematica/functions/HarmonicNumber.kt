package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HarmonicNumber
 *
 * Full name:        System`HarmonicNumber
 *
 *                                                 th
 *                   HarmonicNumber[n] gives the n   harmonic number H .
 *                                                                     n
 *                                                                   (r)
 *                   HarmonicNumber[n, r] gives the harmonic number H    of order r.
 * Usage:                                                            n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HarmonicNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/HarmonicNumber.html
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
fun harmonicNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HarmonicNumber", arguments.toMutableList(), options)
}
