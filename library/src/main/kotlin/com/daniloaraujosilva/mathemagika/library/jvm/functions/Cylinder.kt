package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cylinder
 *
 * Full name:        System`Cylinder
 *
 *                   Cylinder[{{x , y , z }, {x , y , z }}, r] represents a cylinder of radius r around the line from (x , y , z ) to (x , y , z ).
 *                               1   1   1     2   2   2                                                                1   1   1       2   2   2
 *                   Cylinder[{{x , y , z }, {x , y , z }}] represents a cylinder of radius 1.
 * Usage:                        1   1   1     2   2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cylinder
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cylinder.html
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
fun cylinder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cylinder", arguments.toMutableList(), options)
}
