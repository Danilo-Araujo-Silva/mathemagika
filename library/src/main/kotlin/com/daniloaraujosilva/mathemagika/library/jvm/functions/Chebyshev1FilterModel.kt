package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Chebyshev1FilterModel
 *
 * Full name:        System`Chebyshev1FilterModel
 *
 *                   Chebyshev1FilterModel[n] creates a lowpass Chebyshev type 1 filter of order n.
 *                   Chebyshev1FilterModel[{n, ω }] uses the cutoff frequency ω .
 *                                              c                              c
 *                   Chebyshev1FilterModel[{"type", spec}] creates a filter of a given "type" using the specified parameters spec.
 * Usage:            Chebyshev1FilterModel[{"type", spec}, var] expresses the model in terms of the variable var.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Chebyshev1FilterModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/Chebyshev1FilterModel.html
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
fun chebyshev1FilterModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Chebyshev1FilterModel", arguments.toMutableList(), options)
}
