package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Surd
 *
 * Full name:        System`Surd
 *
 *                                                      th
 * Usage:            Surd[x, n] gives the real-valued n   root of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Surd
 * Documentation:    web: http://reference.wolfram.com/language/ref/Surd.html
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
fun surd(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Surd", arguments.toMutableList(), options)
}
