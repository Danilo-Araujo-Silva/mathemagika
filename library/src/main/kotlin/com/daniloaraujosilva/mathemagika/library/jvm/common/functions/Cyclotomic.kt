package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cyclotomic
 *
 * Full name:        System`Cyclotomic
 *
 *                                                th
 * Usage:            Cyclotomic[n, x] gives the n   cyclotomic polynomial in x.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Cyclotomic
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cyclotomic.html
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
fun cyclotomic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cyclotomic", arguments.toMutableList(), options)
}
