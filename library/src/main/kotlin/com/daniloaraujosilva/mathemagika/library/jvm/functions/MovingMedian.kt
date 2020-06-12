package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MovingMedian
 *
 * Full name:        System`MovingMedian
 *
 * Usage:            MovingMedian[list, r] gives the moving median of list, computed using spans of r elements.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MovingMedian
 * Documentation:    web: http://reference.wolfram.com/language/ref/MovingMedian.html
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
fun movingMedian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MovingMedian", arguments.toMutableList(), options)
}
