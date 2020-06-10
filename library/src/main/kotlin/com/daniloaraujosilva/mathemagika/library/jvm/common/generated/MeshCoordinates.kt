package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MeshCoordinates
 * 
 * Full name:        System`MeshCoordinates
 * 
 * Usage:            MeshCoordinates[mreg] gives a list of coordinates in the mesh region mreg.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MeshCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCoordinates.html
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
fun meshCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCoordinates", arguments.toMutableList(), options)
}
