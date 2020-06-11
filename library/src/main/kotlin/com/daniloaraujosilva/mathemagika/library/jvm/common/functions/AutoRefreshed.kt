package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AutoRefreshed
 *
 * Full name:        System`AutoRefreshed
 *
 *                   AutoRefreshed[expr] represents an expression to be reevaluated every hour and made available in the cloud.
 *                   AutoRefreshed[expr, dt] reevaluates at time interval dt.
 *                   AutoRefreshed[expr, timespec] reevaluates on the schedule specified by timespec.
 *                   AutoRefreshed[expr, timespec, fmt] specifies that the result from evaluating expr should be given in format fmt.
 * Usage:            AutoRefreshed[expr, timespec, {fmt, rform}] specifies that the result should be given as a response of the form rform.
 *
 * Options:
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AutoRefreshed
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoRefreshed.html
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
fun autoRefreshed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoRefreshed", arguments.toMutableList(), options)
}
