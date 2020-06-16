package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteThickness
 *
 * Full name:        System`AbsoluteThickness
 *
 * Usage:            AbsoluteThickness[d] is a graphics directive which specifies that lines which follow are to be drawn with absolute thickness d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbsoluteThickness
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteThickness.html
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
fun absoluteThickness(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteThickness", arguments.toMutableList(), options)
}
