package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Glow
 *
 * Full name:        System`Glow
 *
 *                   Glow[col] is a graphics directive which specifies that surfaces of 3D graphics objects that follow are to be taken to glow with color col.
 * Usage:            Glow[] specifies that there is no glow.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Glow
 * Documentation:    web: http://reference.wolfram.com/language/ref/Glow.html
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
fun glow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Glow", arguments.toMutableList(), options)
}
