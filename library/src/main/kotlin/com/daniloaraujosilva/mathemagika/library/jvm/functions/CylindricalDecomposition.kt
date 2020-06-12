package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CylindricalDecomposition
 *
 * Full name:        System`CylindricalDecomposition
 *
 *                   CylindricalDecomposition[ineqs, {x , x , …}] finds a decomposition of the region represented by the inequalities ineqs into cylindrical parts whose directions correspond to the successive x .
 *                                                     1   2                                                                                                                                                      i
 *                   CylindricalDecomposition[ineqs, {x , x , …}, op] finds a decomposition of the result of applying the topological operation op to the region represented by the inequalities ineqs.
 * Usage:                                              1   2
 *
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CylindricalDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/CylindricalDecomposition.html
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
fun cylindricalDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CylindricalDecomposition", arguments.toMutableList(), options)
}
