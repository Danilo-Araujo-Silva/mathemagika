package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PlanarAngle
 * 
 * Full name:        System`PlanarAngle
 * 
 *                   PlanarAngle[p  {q , q }] gives the angle between the half‐lines from p through q  and q .
 *                                     1   2                                                          1      2
 *                   PlanarAngle[{q , p, q }] gives the angle at p formed by the triangle with vertex points p, q  and q .
 *                                 1      2                                                                      1      2
 * Usage:            PlanarAngle[…, "spec"] gives the angle specified by "spec".
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PlanarAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlanarAngle.html
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
fun planarAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlanarAngle", arguments.toMutableList(), options)
}
