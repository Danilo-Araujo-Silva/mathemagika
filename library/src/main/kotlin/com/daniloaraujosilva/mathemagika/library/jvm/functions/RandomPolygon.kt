package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RandomPolygon
 *
 * Full name:        System`RandomPolygon
 *
 *                   RandomPolygon[n] gives a pseudorandom simple polygon with n vertex points.
 *                   RandomPolygon[spec] gives a pseudorandom polygon with the specified specification spec.
 *                   RandomPolygon[spec, k] gives a list of k pseudorandom polygons.
 * Usage:            RandomPolygon[d  spec, …] gives a pseudorandom polygon in dimension d.
 *
 *                   BaseStyle -> {}
 *                   DataRange -> Automatic
 *                   DefaultBaseStyle -> {}
 *                   VertexColors -> Automatic
 *                   VertexNormals -> Automatic
 *                   VertexTextureCoordinates -> None
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomPolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomPolygon.html
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
fun randomPolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomPolygon", arguments.toMutableList(), options)
}
