package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalS2Prime
 *
 * Full name:        System`SpheroidalS2Prime
 *
 *                                                                                                                           (2)
 *                   SpheroidalS2Prime[n, m, γ, z] gives the derivative with respect to z of the radial spheroidal function S    (γ, z) of the second kind.
 * Usage:                                                                                                                    n, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalS2Prime
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalS2Prime.html
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
fun spheroidalS2Prime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalS2Prime", arguments.toMutableList(), options)
}
