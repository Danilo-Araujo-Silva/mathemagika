package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocalSubmit
 *
 * Full name:        System`LocalSubmit
 *
 *                   LocalSubmit[expr] submits a task to evaluate expr in a separate kernel.
 * Usage:            LocalSubmit[ScheduledTask[expr, spec]] submits a task to evaluate expr in a separate kernel on the schedule defined by spec.
 *
 *                   AutoRemove -> True
 *                   HandlerFunctions -> <||>
 * Options:          HandlerFunctionsKeys -> Automatic
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalSubmit.html
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
fun localSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalSubmit", arguments.toMutableList(), options)
}
