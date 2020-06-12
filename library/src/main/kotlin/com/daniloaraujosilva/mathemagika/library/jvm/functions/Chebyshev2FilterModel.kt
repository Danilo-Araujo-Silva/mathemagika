package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Chebyshev2FilterModel
 *
 * Full name:        System`Chebyshev2FilterModel
 *
 *                   Chebyshev2FilterModel[n] creates a lowpass Chebyshev type 2 filter of order n.
 *                   Chebyshev2FilterModel[{n, ω }] uses the cutoff frequency ω .
 *                                              c                              c
 *                   Chebyshev2FilterModel[{"type", spec}] uses the full filter specification {"type", spec}.
 * Usage:            Chebyshev2FilterModel[{"type", spec}, var] expresses the model in terms of the variable var.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Chebyshev2FilterModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/Chebyshev2FilterModel.html
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
fun chebyshev2FilterModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Chebyshev2FilterModel", arguments.toMutableList(), options)
}
