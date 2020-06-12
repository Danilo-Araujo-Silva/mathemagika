package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LunarEclipse
 *
 * Full name:        System`LunarEclipse
 *
 *                   LunarEclipse[] gives the time of the next lunar eclipse.
 *                   LunarEclipse[datespec] gives the time for the next lunar eclipse after the specified date.
 *                   LunarEclipse[propertyspec] gives the specified property value for the next lunar eclipse.
 * Usage:            LunarEclipse[datespec, propertyspec] gives the specified property value for the next lunar eclipse after the specified date.
 *
 *                   EclipseType :> Automatic
 *                   TimeDirection :> 1
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LunarEclipse
 * Documentation:    web: http://reference.wolfram.com/language/ref/LunarEclipse.html
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
fun lunarEclipse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LunarEclipse", arguments.toMutableList(), options)
}
