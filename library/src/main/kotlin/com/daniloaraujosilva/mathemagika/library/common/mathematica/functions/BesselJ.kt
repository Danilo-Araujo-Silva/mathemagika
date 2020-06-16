package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BesselJ
 *
 * Full name:        System`BesselJ
 *
 *                   BesselJ[n, z] gives the Bessel function of the first kind J (z).
 * Usage:                                                                       n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BesselJ
 * Documentation:    web: http://reference.wolfram.com/language/ref/BesselJ.html
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
fun besselJ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BesselJ", arguments.toMutableList(), options)
}
