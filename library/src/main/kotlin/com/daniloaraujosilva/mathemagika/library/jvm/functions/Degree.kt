package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Degree
 *
 * Full name:        System`Degree
 *
 *                                                                                                  π
 *                   Degree gives the number of radians in one degree. It has a numerical value of ---.
 * Usage:                                                                                          180
 *
 * Options:          None
 *
 *                   Constant
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Degree
 * Documentation:    web: http://reference.wolfram.com/language/ref/Degree.html
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
fun degree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Degree", arguments.toMutableList(), options)
}
