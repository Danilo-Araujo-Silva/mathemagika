package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PointSize
 *
 * Full name:        System`PointSize
 *
 * Usage:            PointSize[d] is a graphics directive which specifies that points which follow are to be shown if possible as circular regions with diameter d. The diameter d is given as a fraction of the total width of the plot.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PointSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/PointSize.html
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
fun pointSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PointSize", arguments.toMutableList(), options)
}
