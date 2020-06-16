package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DateDifference
 *
 * Full name:        System`DateDifference
 *
 *                   DateDifference[date , date ] gives the number of days from date  to date .
 *                                      1      2                                    1        2
 *                   DateDifference[date , date , "unit"] gives the difference between date  and date  in the specified unit.
 *                                      1      2                                           1         2
 *                   DateDifference[date , date , {"unit ", "unit ", …}] gives the difference as a list with elements corresponding to the successive "unit ".
 * Usage:                               1      2        1        2                                                                                         i
 *
 *                   CalendarType -> Automatic
 * Options:          DayCountConvention -> ActualActual
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateDifference
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateDifference.html
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
fun dateDifference(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateDifference", arguments.toMutableList(), options)
}
