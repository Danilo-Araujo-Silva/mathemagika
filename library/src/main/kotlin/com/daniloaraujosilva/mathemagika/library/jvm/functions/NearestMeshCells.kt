package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NearestMeshCells
 *
 * Full name:        System`NearestMeshCells
 *
 *                   NearestMeshCells[mr, pt] gives the indices for the cells to which the point pt is nearest in the mesh region mr.
 *                   NearestMeshCells[mr, pt, n] gives the n nearest cell indices to pt.
 *                   NearestMeshCells[mr, pt, {n, r}] gives the n or fewer nearest cell indices to pt that are within radius r of pt.
 * Usage:            NearestMeshCells[{mr, d}, …] gives the indices for the cells of dimension d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NearestMeshCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/NearestMeshCells.html
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
fun nearestMeshCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NearestMeshCells", arguments.toMutableList(), options)
}
