package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FinancialData
 *
 * Full name:        System`FinancialData
 *
 *                   FinancialData["name"] gives the last known price or value for the financial entity specified by "name".
 *                   FinancialData["name", start] gives a list of dates and daily closing values for "name" from start until the current date.
 *                   FinancialData["name", {start, end}] gives a list of dates and daily closing values for dates from start to end.
 *                   FinancialData["name", {start, end, period}] gives a list of dates and prices for the specified periods lying between start and end.
 *                   FinancialData["name", "prop"] gives the value of the specified property for the financial entity "name".
 * Usage:            FinancialData["name", "prop", {start, end, …}] gives a list of dates and values of a property for a sequence of dates or periods.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FinancialData
 * Documentation:    web: http://reference.wolfram.com/language/ref/FinancialData.html
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
fun financialData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FinancialData", arguments.toMutableList(), options)
}
