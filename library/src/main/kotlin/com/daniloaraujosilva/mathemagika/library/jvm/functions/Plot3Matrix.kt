package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Plot3Matrix
 *
 * Full name:        System`Plot3Matrix
 *
 * Usage:            System`Plot3Matrix
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Plot3Matrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/Plot3Matrix.html
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
fun plot3Matrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Plot3Matrix", arguments.toMutableList(), options)
}
