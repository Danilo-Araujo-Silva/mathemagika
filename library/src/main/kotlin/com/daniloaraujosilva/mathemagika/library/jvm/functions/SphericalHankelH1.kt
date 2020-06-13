package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SphericalHankelH1
 *
 * Full name:        System`SphericalHankelH1
 *
 *                                                                                                  (1)
 *                   SphericalHankelH1[n, z] gives the spherical Hankel function of the first kind h   (z).
 * Usage:                                                                                           n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SphericalHankelH1
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalHankelH1.html
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
fun sphericalHankelH1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalHankelH1", arguments.toMutableList(), options)
}
