package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolyhedronData
 * 
 * Full name:        System`PolyhedronData
 * 
 *                   PolyhedronData[poly, "property"] gives the value of the specified property for the polyhedron named poly.
 *                   PolyhedronData[poly] gives an image of the polyhedron named poly.
 * Usage:            PolyhedronData["class"] gives a list of the polyhedra in the specified class.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PolyhedronData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyhedronData.html
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
fun polyhedronData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyhedronData", arguments.toMutableList(), options)
}
