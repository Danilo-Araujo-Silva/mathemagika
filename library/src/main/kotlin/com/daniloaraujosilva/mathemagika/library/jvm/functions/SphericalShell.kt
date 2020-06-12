package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SphericalShell
 *
 * Full name:        System`SphericalShell
 *
 *                   SphericalShell[c, {r     , r     }] represents a filled spherical shell centered at c with inner radius r      and outer radius r     .
 * Usage:                                inner   outer                                                                        inner                   outer
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SphericalShell
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalShell.html
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
fun sphericalShell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalShell", arguments.toMutableList(), options)
}
