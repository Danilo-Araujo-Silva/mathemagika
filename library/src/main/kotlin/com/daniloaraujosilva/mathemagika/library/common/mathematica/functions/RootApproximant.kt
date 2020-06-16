package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RootApproximant
 *
 * Full name:        System`RootApproximant
 *
 *                   RootApproximant[x] converts the number x to one of the "simplest" algebraic numbers that approximates it well.
 * Usage:            RootApproximant[x, n] finds an algebraic number of degree at most n that approximates x.
 *
 * Options:          Method -> Automatic
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RootApproximant
 * Documentation:    web: http://reference.wolfram.com/language/ref/RootApproximant.html
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
fun rootApproximant(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RootApproximant", arguments.toMutableList(), options)
}
