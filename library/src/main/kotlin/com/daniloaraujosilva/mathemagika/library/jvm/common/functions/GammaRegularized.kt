package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GammaRegularized
 *
 * Full name:        System`GammaRegularized
 *
 * Usage:            GammaRegularized[a, z] is the regularized incomplete gamma function Q(a, z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GammaRegularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/GammaRegularized.html
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
fun gammaRegularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GammaRegularized", arguments.toMutableList(), options)
}
