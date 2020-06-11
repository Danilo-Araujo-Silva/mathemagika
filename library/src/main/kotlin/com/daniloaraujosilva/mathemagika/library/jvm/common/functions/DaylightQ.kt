package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DaylightQ
 *
 * Full name:        System`DaylightQ
 *
 *                   DaylightQ[] gives True if it is currently daylight from the user's location.
 *                   DaylightQ[datespec] gives True if it is daylight from the user's location on the specified datespec.
 *                   DaylightQ[locationspec] gives True if it is currently daylight from the specified locationspec.
 *                   DaylightQ[locationspec, datespec] gives True if it is daylight from the specified locationspec on the specified datespec.
 *                   DaylightQ[{{location , date }, {location , date }, …}] gives True if it is daylight from the specified locations and dates.
 *                                       1      1            2      2
 * Usage:            DaylightQ[locationspec, datespec, inclusionspec] gives True if it is daylight from the specified locationspec on the specified datespec taking inclusionspec into account.
 *
 * Options:          SunAngleTest -> (#1 > 0 & )
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DaylightQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DaylightQ.html
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
fun daylightQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DaylightQ", arguments.toMutableList(), options)
}
