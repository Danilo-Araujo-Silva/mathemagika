package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ContinuousTask
 * 
 * Full name:        System`ContinuousTask
 * 
 *                   ContinuousTask[expr] represents a task in which expr is continuously reevaluated.
 *                   ContinuousTask[expr, end] represents a task in which expr is continuously reevaluated until the time specified by end.
 * Usage:            ContinuousTask[expr, tspan] represents a task in which expr is continuously reevaluated over the time span tspan.
 * 
 *                   NotificationFunction -> Automatic
 *                   RestartInterval -> Automatic
 * Options:          TimeZone -> Automatic
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ContinuousTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuousTask.html
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
fun continuousTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuousTask", arguments.toMutableList(), options)
}
