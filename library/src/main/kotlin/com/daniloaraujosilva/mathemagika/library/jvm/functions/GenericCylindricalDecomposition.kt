package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GenericCylindricalDecomposition
 *
 * Full name:        System`GenericCylindricalDecomposition
 *
 *                   GenericCylindricalDecomposition[ineqs, {x , x , …}] finds the full-dimensional part of the decomposition of the region represented by the inequalities ineqs into cylindrical parts whose directions correspond to the successive x , together with any hypersurfaces containing the rest of the region.
 * Usage:                                                     1   2                                                                                                                                                                                     i
 *
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GenericCylindricalDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenericCylindricalDecomposition.html
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
fun genericCylindricalDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenericCylindricalDecomposition", arguments.toMutableList(), options)
}
