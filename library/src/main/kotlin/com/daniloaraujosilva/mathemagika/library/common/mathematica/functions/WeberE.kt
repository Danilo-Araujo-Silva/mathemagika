package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeberE
 *
 * Full name:        System`WeberE
 *
 *                   WeberE[ν, z] gives the Weber function E (z).
 *                                                          ν
 *                                                                        μ
 *                   WeberE[ν, μ, z] gives the associated Weber function E (z).
 * Usage:                                                                 ν
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeberE
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeberE.html
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
fun weberE(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeberE", arguments.toMutableList(), options)
}
