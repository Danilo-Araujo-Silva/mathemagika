package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SiderealTime
 * 
 * Full name:        System`SiderealTime
 * 
 *                   SiderealTime[] gives the right ascension of the local meridian for the current date and location.
 *                   SiderealTime[date] gives the right ascension of the local meridian for the specified date.
 *                   SiderealTime[loc] gives the right ascension of the local meridian for the specified location.
 *                   SiderealTime[loc, date] gives the right ascension of the local meridian for the specified date and location.
 *                   SiderealTime[{{loc , date }, {loc , date }, …}] gives the right ascensions of the local meridians for all specified locations on the specified dates.
 *                                     1      1       2      2
 * Usage:            SiderealTime[loc, date, func] uses func to determine what to return for extended locations.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SiderealTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/SiderealTime.html
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
fun siderealTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SiderealTime", arguments.toMutableList(), options)
}
