package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Band
 *
 * Full name:        System`Band
 *
 *                   Band[{i, j}] represents the sequence of positions on the diagonal band that starts with {i, j} in a sparse array.
 *                   Band[{i   , j   , …}, {i   , j   , …}] represents the positions between {i   , j   , …} and {i   , j   , …}.
 *                          min   min        max   max                                         min   min           max   max
 *                   Band[{i   , j   , …}, {i   , j   , …}, {di, dj, …}] represents positions starting with {i   , j   , …} and then moving with step {di, dj, …}.
 * Usage:                   min   min        max   max                                                        min   min
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Band
 * Documentation:    web: http://reference.wolfram.com/language/ref/Band.html
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
fun band(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Band", arguments.toMutableList(), options)
}
