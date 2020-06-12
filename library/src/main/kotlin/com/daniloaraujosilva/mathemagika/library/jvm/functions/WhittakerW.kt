package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WhittakerW
 *
 * Full name:        System`WhittakerW
 *
 *                   WhittakerW[k, m, z] gives the Whittaker function W    (z).
 * Usage:                                                              k, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WhittakerW
 * Documentation:    web: http://reference.wolfram.com/language/ref/WhittakerW.html
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
fun whittakerW(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WhittakerW", arguments.toMutableList(), options)
}
