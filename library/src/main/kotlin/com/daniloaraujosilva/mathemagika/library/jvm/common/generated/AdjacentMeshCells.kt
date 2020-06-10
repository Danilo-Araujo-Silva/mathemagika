package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AdjacentMeshCells
 * 
 * Full name:        System`AdjacentMeshCells
 * 
 * Usage:            AdjacentMeshCells[mr, cellspec, d] gives cells of dimension d adjacent to the cell specified by cellspec in the mesh mr.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AdjacentMeshCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/AdjacentMeshCells.html
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
fun adjacentMeshCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AdjacentMeshCells", arguments.toMutableList(), options)
}
