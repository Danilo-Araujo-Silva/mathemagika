package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalS1
 *
 * Full name:        System`SpheroidalS1
 *
 *                                                                                  (1)
 *                   SpheroidalS1[n, m, γ, z] gives the radial spheroidal function S    (γ, z) of the first kind.
 * Usage:                                                                           n, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalS1
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalS1.html
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
fun spheroidalS1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalS1", arguments.toMutableList(), options)
}
