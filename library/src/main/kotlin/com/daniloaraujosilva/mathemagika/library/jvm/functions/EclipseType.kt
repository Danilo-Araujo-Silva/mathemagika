package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EclipseType
 *
 * Full name:        System`EclipseType
 *
 * Usage:            EclipseType is an option for SolarEclipse and LunarEclipse that specifies the type of eclipse being queried for.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EclipseType
 * Documentation:    web: http://reference.wolfram.com/language/ref/EclipseType.html
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
fun eclipseType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EclipseType", arguments.toMutableList(), options)
}
