package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Hue
 *
 * Full name:        System`Hue
 *
 *                   Hue[h] is a graphics directive which specifies that objects which follow are to be displayed, in a color corresponding to hue h.
 *                   Hue[h, s, b] specifies colors in terms of hue, saturation, and brightness.
 * Usage:            Hue[h, s, b, a] specifies opacity a.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Hue
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hue.html
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
fun hue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hue", arguments.toMutableList(), options)
}
