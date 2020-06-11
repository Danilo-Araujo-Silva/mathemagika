package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SolarEclipse
 *
 * Full name:        System`SolarEclipse
 *
 *                   SolarEclipse[] gives the time of the next solar eclipse.
 *                   SolarEclipse[datespec] gives the time for the next solar eclipse after the specified date.
 *                   SolarEclipse[propertyspec] gives the specified property value for the next solar eclipse.
 * Usage:            SolarEclipse[datespec, propertyspec] gives the specified property value for the next solar eclipse after the specified date.
 *
 *                   EclipseType :> Automatic
 *                   TimeDirection :> 1
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SolarEclipse
 * Documentation:    web: http://reference.wolfram.com/language/ref/SolarEclipse.html
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
fun solarEclipse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SolarEclipse", arguments.toMutableList(), options)
}
