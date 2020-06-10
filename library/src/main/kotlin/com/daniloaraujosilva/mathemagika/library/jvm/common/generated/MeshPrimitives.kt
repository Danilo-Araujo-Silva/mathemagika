package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MeshPrimitives
 * 
 * Full name:        System`MeshPrimitives
 * 
 *                   MeshPrimitives[mreg, d] gives the graphics primitives for cells of dimension d in the mesh region mreg.
 * Usage:            MeshPrimitives[mreg, cellspec] gives the primitives specified by cellspec.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MeshPrimitives
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshPrimitives.html
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
fun meshPrimitives(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshPrimitives", arguments.toMutableList(), options)
}
