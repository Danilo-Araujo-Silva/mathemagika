package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolyhedronDecomposition
 *
 * Full name:        System`PolyhedronDecomposition
 *
 *                   PolyhedronDecomposition[poly] decomposes the polyhedron poly into a union of simpler polyhedra.
 * Usage:            PolyhedronDecomposition[poly, "decomp"] decomposes into polyhedra of the specified "decomp".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolyhedronDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyhedronDecomposition.html
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
fun polyhedronDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyhedronDecomposition", arguments.toMutableList(), options)
}
