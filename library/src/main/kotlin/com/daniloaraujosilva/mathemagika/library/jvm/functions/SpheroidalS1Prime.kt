package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalS1Prime
 *
 * Full name:        System`SpheroidalS1Prime
 *
 *                                                                                                                           (1)
 *                   SpheroidalS1Prime[n, m, γ, z] gives the derivative with respect to z of the radial spheroidal function S    (γ, z) of the first kind.
 * Usage:                                                                                                                    n, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalS1Prime
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalS1Prime.html
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
fun spheroidalS1Prime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalS1Prime", arguments.toMutableList(), options)
}
