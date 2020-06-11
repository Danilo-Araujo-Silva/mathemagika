package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StadiumShape
 *
 * Full name:        System`StadiumShape
 *
 *                   StadiumShape[{{x , y }, {x , y }}, r] represents a stadium of radius r between the points {x , y } and {x , y }.
 * Usage:                            1   1     2   2                                                             1   1        2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StadiumShape
 * Documentation:    web: http://reference.wolfram.com/language/ref/StadiumShape.html
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
fun stadiumShape(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StadiumShape", arguments.toMutableList(), options)
}
