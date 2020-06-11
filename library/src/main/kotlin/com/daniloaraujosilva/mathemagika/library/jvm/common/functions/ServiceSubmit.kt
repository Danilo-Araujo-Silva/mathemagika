package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ServiceSubmit
 *
 * Full name:        System`ServiceSubmit
 *
 *                   ServiceSubmit[ServiceRequest[assoc]] submits a request to be executed by an external service specified by assoc.
 *                   ServiceSubmit[ScheduledTask[req, spec]] submits a task to evaluate ServiceRequest req on an external service following the schedule defined by spec.
 * Usage:            ServiceSubmit[ContinuousTask[req, spec]] submits a task to evaluate ServiceRequest req on an external service; the result of the request is updated whenever available.
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
 *                   local: paclet:ref/ServiceSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/ServiceSubmit.html
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
fun serviceSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ServiceSubmit", arguments.toMutableList(), options)
}
