package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cone
 *
 * Full name:        System`Cone
 *
 *                   Cone[{{x , y , z }, {x , y , z }}, r] represents a cone with a base of radius r centered at (x , y , z ) and a tip at (x , y , z ).
 *                           1   1   1     2   2   2                                                               1   1   1                 2   2   2
 *                   Cone[{{x , y , z }, {x , y , z }}] represents a cone with a base of radius 1.
 * Usage:                    1   1   1     2   2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cone
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cone.html
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
fun cone(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cone", arguments.toMutableList(), options)
}
