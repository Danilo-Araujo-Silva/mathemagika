package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FullInformationOutputRegulator
 *
 * Full name:        System`FullInformationOutputRegulator
 *
 *                   FullInformationOutputRegulator[sys, rspec] gives the full state information output regulator for sys using specification rspec.
 *                   FullInformationOutputRegulator[{sys, {out , …}, {in , …}}, …] specifies the regulated outputs out  and the controlled inputs in .
 * Usage:                                                     1         1                                             i                             j
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FullInformationOutputRegulator
 * Documentation:    web: http://reference.wolfram.com/language/ref/FullInformationOutputRegulator.html
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
fun fullInformationOutputRegulator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FullInformationOutputRegulator", arguments.toMutableList(), options)
}
