package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Thickness
 *
 * Full name:        System`Thickness
 *
 * Usage:            Thickness[r] is a graphics directive which specifies that lines which follow are to be drawn with thickness r. The thickness r is given as a fraction of the horizontal plot range.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Thickness
 * Documentation:    web: http://reference.wolfram.com/language/ref/Thickness.html
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
fun thickness(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Thickness", arguments.toMutableList(), options)
}
