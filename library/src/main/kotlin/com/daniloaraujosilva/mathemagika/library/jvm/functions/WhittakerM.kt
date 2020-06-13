package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WhittakerM
 *
 * Full name:        System`WhittakerM
 *
 *                   WhittakerM[k, m, z] gives the Whittaker function M    (z).
 * Usage:                                                              k, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WhittakerM
 * Documentation:    web: http://reference.wolfram.com/language/ref/WhittakerM.html
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
fun whittakerM(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WhittakerM", arguments.toMutableList(), options)
}
