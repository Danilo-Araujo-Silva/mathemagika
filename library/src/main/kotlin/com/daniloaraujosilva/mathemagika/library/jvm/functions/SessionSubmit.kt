package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SessionSubmit
 *
 * Full name:        System`SessionSubmit
 *
 *                   SessionSubmit[expr] submits an asynchronous task to evaluate expr in the current session.
 * Usage:            SessionSubmit[ScheduledTask[expr, spec]] submits a task to evaluate expr in the current session on the schedule defined by spec.
 *
 *                   AutoRemove -> True
 *                   HandlerFunctions -> <||>
 *                   HandlerFunctionsKeys -> Automatic
 * Options:          Method -> Automatic
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SessionSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/SessionSubmit.html
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
fun sessionSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SessionSubmit", arguments.toMutableList(), options)
}
