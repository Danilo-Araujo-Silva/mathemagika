package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindCurvePath
 *
 * Full name:        System`FindCurvePath
 *
 *                   FindCurvePath[{{x , y }, {x , y }, …}] gives an ordering of the {x , y } that corresponds to one or more smooth curves.
 * Usage:                             1   1     2   2                                  i   i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindCurvePath
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindCurvePath.html
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
fun findCurvePath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindCurvePath", arguments.toMutableList(), options)
}
