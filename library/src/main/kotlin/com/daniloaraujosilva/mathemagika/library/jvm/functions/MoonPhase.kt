package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MoonPhase
 *
 * Full name:        System`MoonPhase
 *
 *                   MoonPhase[] gives moon phase fraction of illumination for the current date.
 *                   MoonPhase[datespec] gives moon phase fraction of illumination for the specified date.
 *                   MoonPhase[property] gives the property of the moon phase for the current date.
 * Usage:            MoonPhase[datespec, property] gives the property of the moon phase for the specified date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoonPhase
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoonPhase.html
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
fun moonPhase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoonPhase", arguments.toMutableList(), options)
}
