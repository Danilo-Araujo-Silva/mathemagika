package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalS2
 *
 * Full name:        System`SpheroidalS2
 *
 *                                                                                  (2)
 *                   SpheroidalS2[n, m, γ, z] gives the radial spheroidal function S    (γ, z) of the second kind.
 * Usage:                                                                           n, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalS2
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalS2.html
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
fun spheroidalS2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalS2", arguments.toMutableList(), options)
}
