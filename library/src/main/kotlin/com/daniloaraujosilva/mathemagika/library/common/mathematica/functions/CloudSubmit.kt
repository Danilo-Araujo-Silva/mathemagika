package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CloudSubmit
 *
 * Full name:        System`CloudSubmit
 *
 *                   CloudSubmit[expr] submits expr for immediate asynchronous cloud evaluation.
 * Usage:            CloudSubmit[ScheduledTask[expr, spec]] submits a task to evaluate expr in the cloud on the schedule defined by spec.
 *
 *                   CloudBase :> $CloudBase
 *                   HandlerFunctions -> <||>
 *                   HandlerFunctionsKeys -> Automatic
 *                   IncludeDefinitions -> True
 *                   Method -> Automatic
 * Options:          NotificationFunction -> Automatic
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudSubmit.html
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
fun cloudSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudSubmit", arguments.toMutableList(), options)
}
