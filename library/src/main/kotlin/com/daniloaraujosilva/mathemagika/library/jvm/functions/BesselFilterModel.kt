package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BesselFilterModel
 *
 * Full name:        System`BesselFilterModel
 *
 *                   BesselFilterModel[n] designs a lowpass Bessel filter of order n and cutoff frequency 1.
 *                   BesselFilterModel[{n, ω }] uses the cutoff frequency ω .
 *                                          c                              c
 *                   BesselFilterModel[{n, ω }, var] expresses the model in terms of the variable var.
 * Usage:                                   c
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BesselFilterModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/BesselFilterModel.html
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
fun besselFilterModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BesselFilterModel", arguments.toMutableList(), options)
}
